package day4.practice;

import java.util.Scanner;

public class IfMultipleEx1 {

	public static void main(String[] args) {
		//정수 num를 입력받아 num가 2,3,6의 배수가 아닌지 판별하는 코드를 작성하세요.
		Scanner sc= new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		//6의 배수일 때 원하는 동작이 실행되기 위해 6의 배수먼저 체크하도록 순서를 신경씀.
		if(num%6==0 ) {
			System.out.println("6의 배수입니다.");
		}
		else if(num%3==0){
			System.out.println("3의 배수 입니다.");
		}
		else if(num%2==0) {
			System.out.println("2의 배수 입니다.");
		}
		else
		{
			System.out.println("2,3,6의 배수가 아닙니다.");
		}
		//6의 배수가 아닌 2의 배수만 찾기 위해 2의 배수이지만 3의 배수가 아닌 정수를 확인
		if(num%2==0 && num%3!=0) {
			System.out.println("2의 배수입니다.");
		}
		else if(num%3==0 && num%2!=0){
			System.out.println("3의 배수 입니다.");
		}
		else if(num%6==0) {
			System.out.println("6의 배수 입니다.");
		}
		else
		{
			System.out.println("2,3,6의 배수가 아닙니다.");
		}
		
		sc.close();

	}
}
