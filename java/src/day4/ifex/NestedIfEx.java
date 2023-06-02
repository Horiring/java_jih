package day4.ifex;

public class NestedIfEx {

	public static void main(String[] args) {
		/*
		 * 2,3,6의 배수 판별 예제
		 * 
		 */
		int num = 6;
		//2의배수
		if(num%2==0) {
			if(num %3==0) {
				System.out.println("6의 배수입니다");
			}
			else {
				System.out.println("2의 배수입니다");
			}
		}
		//3의 배수
		else if(num % 3 ==0) {
			System.out.println("3의 배수입니다");
		}
		else {
			System.out.println("2,3,6의 배수가아닙니다.");
		}
	}

}
