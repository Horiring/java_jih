package day2.homwork;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		/*
		콘솔에서 정수 2개와 문자(산술연산자)를 입력받아 출력하는 코드를 작성하세요
		예 :
		두 정수와 산술연산자를 입력하세요 (예:1 +2)
		출력 1+2
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 산술연살자를 입력하세요");
		int num1 = sc.nextInt();
		char operator = sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		System.out.println(""+num1+operator+num2);
		sc.close();
	}

}
