package day8.homework;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class MethodArithmeticEx {

	public static void main(String[] args) {
		// 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
		// 연산자를 잘못 입력한 경우는 없다고 가정 , 0으로 나누는 일은 없다고 가정.
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 산술연산자를 입력해주세요. (ex :1 + 1)");
		int num1 = sc.nextInt();
		char ch = sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		double res = ari(num1, ch, num2);
		System.out.println("" + num1 + ch + num2 + "=" + res);
		sc.close();
	}

	public static double ari(int num1, char ch1, int num2) {
		double result = 0.0;
		switch (ch1) {
		case '+':
			result = num1 + num2;
			break;
			//return num1+num2;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = (double)num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			//잘못된 연산자인 경우 예외처리
			//throw new RuntimeException("잘못된 연산자입니다.");
		}
		return result;
	}
}
