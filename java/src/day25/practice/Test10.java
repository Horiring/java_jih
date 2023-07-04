
package day25.practice;

public class Test10 {

	public static void main(String[] args) {
		PhoneNumber pn1 = new PhoneNumber("Hong", null);
		//기본 생성자가 없어서 에러 발생. 생성자가 있기 때문에 기본 생성자가 자동으로 추가되지 x
		PhoneNumber pn2 = new PhoneNumber("lim","3");
	}

}