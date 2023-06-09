package day8.practice;

import java.util.Scanner;

public class MethodMultipleEx {

	public static void main(String[] args) {
		//정수 num을 입력 받아 2,3,6,의 배수인지 아닌지 판별하는 코드를 작성하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		if(Multiple(num)) {
		System.out.println("2,3,6의 배수입니다.");
		}
		else {
			System.out.println("2,3,6의 배수가 아닙니다.");
		}
		
		if(Multiple3(num,6)) {
			System.out.println("6의 배수입니다.");
			}
			else if(Multiple3(num,3)) {
				System.out.println("3의 배수.");
			}
			else if(Multiple3(num,2)) {
				System.out.println("2의 배수.");
			}
			else {
				System.out.println("236의배수가아닙니다.");
			}
			
		Multiple2(num);
		sc.close();
	}
	public static boolean Multiple(int num1) {
		return num1%2==0 && num1%3==0 &&num1%6==0;
	}
	
	public static void Multiple2(int num1) {
		if(num1%2==0 && num1%3==0 &&num1%6==0) {
			System.out.println("2,3,6의 배수입니다.");
			}
			else {
				System.out.println("2,3,6의 배수가 아닙니다.");
			}
	}
	public static boolean Multiple3(int num1, int num2) {
		return num1%num2==0;
	}
}
