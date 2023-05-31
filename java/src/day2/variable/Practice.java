package day2.variable;

public class Practice {

	public static void main(StringEx[] args) {
		//char ch1 ="A";
		//문자는 ' ' 로 감싸여야 한다. ""가아님
		char ch1 ='A';
		System.out.println(ch1);
		
		/* 국어, 영어, 수학 성적을 입력하여 평균을 구하려 한다.
		 * 이떄 필요한 변수들을 선언하세요.
		 */
		
		int kor=50, eng=80, math=75;
		
		double avg = (kor+eng+math)/3.0;
		double avg2 = (double)(kor+eng+math)/3;
		
		System.out.println(avg);
		System.out.println(avg2);
	}

}
