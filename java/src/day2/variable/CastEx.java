package day2.variable;

public class CastEx {

	public static void main(String[] args) {
		//3.14는 double형 리터럴이기 떄문에 int에 저장할 수 없음, 강제 형변환을 해야 함.
		int p1 =(int)3.14;
		System.out.println(p1);
		
		double num1 = 3;
		//123L은 long 형 티터럴 이기 떄문에 int 에 저장할 수 없음, 강제형변환 해야함.
		//실제 데이터 분실이 없어도 타입에 맞게 강제형변환을 해야 함.
		int num2 = (int)123L;
		
		//1/2는 문법에는 문제가 없지만 원하는 결과를 얻기위해서 강제형변환을 함.
		System.out.println((double)1/2);
	}

}
