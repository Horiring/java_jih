package day7.method;

public class SumMethodEx {
	
	public static void main(String[] args) {
	//두 정수의 합을 구하는 함수(메서드)
		int num1=1, num2=2;
		int result = sum(num1,num2);
		System.out.println(result);
	}
	/**
	 * 기능   : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 메서드명 : sum
	 * 리턴타입 : 두 정수의 합 => int
	 * 매게변수 : int num1, int num2
	 */
	
	/**
	 * 기능 : 두정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * @param num1
	 * @param num2
	 * @return 두 정수의 합
	 */
	public static int sum (int num1,int num2) {
		int result = num1+num2;
		return result;
		
	}
}
