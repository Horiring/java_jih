package day2.homwork;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		/*
		 * 
		콘솔에서 정수 2개와 문자(산술연산자)를 입력받아 출력하는 코드를 작성하세요
		예 :
		두 정수와 산술연산자를 입력하세요 (예:1 +2)
		출력 1+2

		두 정수를 입력받아 두 정수의 산술 연산 결과를 출력하는 코드를 작성하세요. 단, 2번째 숫자는 0이 아님.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력해주세요.");
		int num1 = sc.nextInt(),num2 = sc.nextInt();
		System.out.println("연산자를 입력하세여!");
		sc.nextLine();
		String str1 = sc.nextLine(); 
		System.out.println(num1+str1+num2);
	}

}
