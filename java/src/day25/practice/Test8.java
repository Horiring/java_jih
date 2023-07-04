package day25.practice;

public class Test8 {

	public static void main(String[] args) {
		int num = 3;
		System.out.println(num + "는 짝수인가? " + isEven(num));
	}
	
	//홀짝을 판별하는 메서드
	public static boolean isEven(int num) {
		if(num % 2 == 0) {
			return true;
		}
		return false;
	}
}