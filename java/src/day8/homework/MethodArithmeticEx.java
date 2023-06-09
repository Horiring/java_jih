package day8.homework;

import java.util.Scanner;

public class MethodArithmeticEx {

	public static void main(String[] args) {
		// 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
		// 연산자를 잘못 입력한 경우는 없다고 가정 , 0으로 나누는 일은 없다고 가정.
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 산술연산자를 입력해주세요. (ex :1+1)");
		int num1 = sc.nextInt();
		char ch = sc.next().charAt(0);
		int num2 = sc.nextInt();

		System.out.println("" + num1 + ch + num2 + "=" + ari(num1, num2, ch));
		sc.close();
	}

	public static double ari(int num1, int num2, char ch1) {
		int result = 0;
		switch (ch1) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			result = 0;
		}
		return result;
	}
}
