package db.day2.board.dao;

import db.day2.board.vo.MemberVO;

public interface MemberDAO {

	void insertMember(String id, String pw);

	MemberVO getMember(String id);

	void deleteMember(String id);

}
