package day2.homwork;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		//콘솔에서 입력받을수 있는 스캐너생성
		/*
두 정수를 입력받아 두 정수의 산술 연산 결과를 출력하는 코드를 작성하세요. 단, 2번째 숫자는 0이 아님.

예:
두 정수를 입력하세요.
1 2 [엔터]
1+2 =3
1 - 2= -1
1  * 2 = 2
1 / 2 = 0.5
1 % 2 = 1

		 */
		Scanner sc = new Scanner(System.in);
		//안내문구 출력
		System.out.println("두 정수를 입력해주세요.");
		//두 정수를 입력받음
		int num1 = sc.nextInt(),num2 = sc.nextInt();
		//두 정수의 산술연산 계산
		int sum = num1+num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div = (double)num1/num2;
		int mod = num1 % num2;
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+((double)num1/num2));
		//%는 +보다 우선순위가 높기 떄문에 ()를 생략해도 되지만 위에 +와 같은 형태로 보여주기 위해()을 붙임
		System.out.println(num1+"%"+num2+"="+(num1%num2));
		
		System.out.println(num1+"+"+num2+"="+sum);
		System.out.println(num1+"-"+num2+"="+sub);
		System.out.println(num1+"*"+num2+"="+mul);
		System.out.println(num1+"/"+num2+"="+div);
		System.out.println(num1+"%"+num2+"="+mod);
		sc.close();

		System.out.println(num1+"%"+num2+"="+(num1%num2));
		}

}
