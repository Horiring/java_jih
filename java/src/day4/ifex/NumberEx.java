package day4.ifex;

public class NumberEx {

	public static void main(String[] args) {
		/*
		 * 정수 num가 양수이면 positive number라고 출력하고
		 * num가 음수이면 nagative number로 출력하고
		 * num가 0이면 0으로 출력하는 코드를 작성하세요.
		 */
		int num = -1;
		if(num>0) {
			System.out.println("positive number");
		}
		else if(num<0) {
			System.out.println("nagative number");
		}
		else {
			System.out.println("0");
		}
		
	}

}
