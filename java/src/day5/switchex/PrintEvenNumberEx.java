package day5.switchex;

public class PrintEvenNumberEx {

	public static void main(String[] args) {
		/*
		 * 방법1.
		 * 반복횟수 : 1는 1부터 5까지 1씩증가
		 * 규칙성 : 2*1을 출력
		 */
		int i =1;
		while(i<=5) {
			System.out.println(2*i);
			i++;
		}		
		System.out.println("==============");
		/*
		 * 방법2.
		 * 반복횟수 : i는 2부터 10까지 2씩증가
		 * 규칙성 : i를 출력
		 */
		i =2;
		while(i<=10) {
			System.out.println(i);
		i= i+2;
		}
		System.out.println("==============");
		/*
		 * 방법3.
		 * 반복횟수 : i는 1부터 10까지 1씩증가
		 * 규칙성 : i가 짝수이면 1을 출력
		 */
		
		i = 1;
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
