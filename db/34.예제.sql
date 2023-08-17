-- 예약 가능한 도서를 조회하는 쿼리
SELECT BO_TITLE FROM BOOK WHERE BO_POSSIBLE_RESERVATION = (SELECT BS_NUM FROM BOOK_STATE WHERE BS_DESC = '예약 가능');

-- QWE123회원이 자바의 정석을 예약했을때 적용해야하는 쿼리

-- 대출 가능한 도서를 조회하는 쿼리
SELECT * FROM BOOK WHERE BO_POSSIBLE_LOAN = (SELECT BS_NUM FROM BOOK_STATE WHERE BS_DESC = '대출 가능');

-- QWE123회원이 대출 가능한 도서를 조회하는 쿼리
SELECT BOOK.* FROM BOOK
LEFT JOIN RESERVATION ON RE_BO_NUM = BO_NUM
WHERE BO_POSSIBLE_LOAN = (SELECT BS_NUM FROM BOOK_STATE WHERE BS_DESC = '대출 가능')
AND
(RE_NUM IS NULL OR RE_ME_ID = 'QWE123');

-- QWE123회원이 예약한 자바의 정석을 대출했을 때 적용해야하는 쿼리
INSERT INTO LOAN(LO_DATE,LO_ME_ID,LO_BO_NUM,LO_EXPECTED_DATE)
SELECT date_format(NOW(),'%Y-%m-%d'),'QWE123',BO_NUM,date_format(DATE_ADD(NOW(),INTERVAL 14 DAY),'%Y-%m-%d')
FROM BOOK
WHERE BO_TITLE = '자바의 정석';

-- 예약 테이블에 데이터를 삭제
DELETE FROM RESERVATION 
WHERE
    RE_ME_ID = 'QWE123'
    AND RE_BO_NUM = (SELECT 
        BO_NUM
    FROM
        BOOK
    
    WHERE
        BO_TITLE = '자바의 정석');
-- 도서 상태를 수정
UPDATE BOOK 
SET 
    BO_POSSIBLE_LOAN = (SELECT 
            BS_NUM
        FROM
            BOOK_STATE
        WHERE
            BS_DESC = '대출 중'),
    BO_POSSIBLE_RESERVATION = (SELECT 
            BS_NUM
        FROM
            BOOK_STATE
        WHERE
            BS_DESC = '예약 가능')
WHERE
    BO_NUM = '101.1ABC12';
    
-- 회원이 대출한 도서 수를 증가.
UPDATE MEMBER 
SET 
    ME_BOOK_COUNT = ME_BOOK_COUNT + 1
WHERE
    ME_ID = 'QWE123';

-- QWE123회원이 현재 대출한 도서를 조회하는 쿼리
SELECT * FROM BOOK
JOIN LOAN ON LO_BO_NUM = BO_NUM
WHERE
	LO_ME_ID = 'QWE123' AND LO_RETURN_DATE IS NULL;

-- QWE123회원이 자바의 정석을 반납했을 때 필요한 쿼리
UPDATE LOAN
SET
	LO_RETURN_DATE = DATE_FORMAT(NOW(),'%Y-%m-%d')
    WHERE
    LO_ME_ID = 'QWE123'
    AND LO_BO_NUM = (SELECT 
        BO_NUM
    FROM
        BOOK
    WHERE
        BO_TITLE = '자바의 정석');
-- 대출 테이블에 반납일을 수정

-- 도서 테이블에 해당 도서의 도서 상태를 수정
UPDATE BOOK 
SET 
    BO_POSSIBLE_LOAN = (SELECT 
            BS_NUM
        FROM
            BOOK_STATE
        WHERE
            BS_DESC = '대출 가능')
WHERE
    BO_NUM = '101.1ABC12';
-- 회원이 대출한 도서 수를 감소 
UPDATE MEMBER 
SET 
    ME_BOOK_COUNT = ME_BOOK_COUNT - 1
WHERE
    ME_ID = 'QWE123';
    
-- 연체일을 계산해서 테이블을 수정
UPDATE MEMBER
 SET
 ME_TOTAL_OVERDUE = ME_TOTAL_OVERDUE + (SELECT 
    CASE
        WHEN DATEDIFF(LO_RETURN_DATE, LO_EXPECTED_DATE) < 1 THEN 0
        ELSE DATEDIFF(LO_RETURN_DATE, LO_EXPECTED_DATE)
    END AS 연체일
FROM
    LOAN
WHERE
    LO_ME_ID = 'QWE123'
        AND LO_BO_NUM = '101.1ABC12')
 WHERE
 ME_ID = 'QWE123';
 -- 회원이 대출한 모든 도서가 반납됐을 때 연체일이 있으면 다음날부터 연체 적용이 되도록 수정
 UPDATE MEMBER
 SET
	ME_APPLY_OVERDUE = (SELECT 
    CASE
        WHEN
            ME_BOOK_COUNT = 0
                AND ME_TOTAL_OVERDUE != 0
        THEN
            DATE_FORMAT(DATE_ADD(NOW(),
                INTERVAL ME_TOTAL_OVERDUE DAY),'%Y-%m-%d')
        ELSE NULL
    END AS T
FROM
    (SELECT * FROM MEBER)AS TMP
WHERE
ME_ID = 'QWE123')
WHERE
    ME_ID = 'QWE123';
-- 각 회원들의 대출이 불가능한 기간을 조회하는 쿼리
-- 대출이 가능한 회원은 대출 가능으로 표시하고,
-- 대출이 불가능한 회원은 언제까지인지를 표시 하도록 작성
SELECT ME_ID AS 아이디, 
CASE
WHEN ME_APPLY_OVERDUE IS NULL THEN '대출가능'
ELSE ME_APPLY_OVERDUE
END AS 대출불가일
FROM MEMBER;

-- 각 도서별 대출 회수를 조회하는 쿼리
SELECT 
    BO_TITLE, COUNT(LO_NUM)
FROM
    BOOK
        LEFT JOIN
    LOAN ON LO_BO_NUM = BO_NUM
GROUP BY BO_NUM;

-- 회원별 연체 회수를 조회하는 쿼리

SELECT 
    ME_ID,COUNT(LO_EXPECTED_DATE < LO_RETURN_DATE)AS 연체회수
FROM
	MEMBER 
		LEFT JOIN
	LOAN ON LO_ME_ID = ME_ID
GROUP BY ME_ID;

-- 도서를 가장 많이 대여한 회원을 조회하는 쿼리
SELECT 
ME_ID AS 아이디,COUNT(LO_NUM) AS 대출도서수 
FROM
MEMBER
LEFT JOIN
LOAN ON LO_ME_ID = ME_ID
GROUP BY ME_ID
ORDER BY 대출도서수 DESC, 아이디 ASC
LIMIT 1;

DELIMITER //
CREATE TRIGGER INSERT_LOAN AFTER INSERT ON LOAN
FOR EACH ROW
BEGIN
	-- NEW.LO_ME_ID 회원이 도서 NEW.LO_BO_NUM을 예약했으면
	IF (SELECT COUNT(*) FROM RESERVATION 
		WHERE RE_ME_ID = NEW.LO_ME_ID AND
			  RE_BO_NUM = NEW.LO_BO_NUM) > 0 THEN 
			-- 삭제
			DELETE FROM RESERVATION
            WHERE
            RE_ME_ID = NEW.LO_ME_ID
            AND RE_BO_NUM = NEW.LO_BO_NUM;
            -- 도서의 예약상태를 예약 가능으로 수정
			UPDATE BOOK
            SET
            BO_POSSIBLE_RESERVATION = (
            SELECT
            BS_NUM
            FROM
            BOOK_STATE
            WHERE
            BS_DESC = '예약 가능'
            )
			WHERE
            BO_NUM = NEW.LO_BO_NUM;
    END IF;
END //
DELIMITER ;
-- 해당 도서를 대출할 때 예약 내역이 있으면 예약 테이블에 데이터를 삭제하고, 도서의 예약 상태를 예약 가능으로 수정
-- 도서 대출 상태를 대출 중으로 수정
-- 회원이 대출한 도서 수를 증가