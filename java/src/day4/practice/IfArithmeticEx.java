package day4.practice;

import java.util.Scanner;

public class IfArithmeticEx {

	public static void main(String[] args) {
		//산술 연산자와 두정수를 입력받아 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요.
		Scanner sc = new Scanner(System.in);
		double result = 0;
		System.out.println("수식을 입력하세요 (ex: 1 + 2)");
		int num=sc.nextInt();
		char op = sc.next().charAt(0);
		int num2=sc.nextInt();
		
		if(op == '+') {
			result=num+num2;
			System.out.println(""+num+" + "+num2+" = "+result);
		}
		else if(op == '-') {
			result= num-num2;
			System.out.println(""+num+" - "+num2+" = "+result);
		}
		else if(op == '*') {
			result= num*num2;
			System.out.println(""+num+" * "+num2+" = "+result);
		}
		else if(op == '/') {
			result= (double)num/num2;
			System.out.println(""+num+" / "+num2+" = "+result);
		}
		else if(op == '%') {
			result= num%num2;
			System.out.println(""+num+" % "+num2+" = "+result);
		}
		else {
			System.out.println(op+"is not artithmetic operator");
		}
		sc.close();
	}

}
