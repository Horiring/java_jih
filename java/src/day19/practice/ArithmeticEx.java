package day19.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

import day18.homework.controller.ArismaticEx;

public class ArithmeticEx {

	public static void main(String[] args) {
		// 두 정수와 산술연산자를 입력했을때 연산 결과를 출력하는 코드를 작성하세요
		// 예외처리 추가
		double result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("input : ");
		try {
		int num1 = sc.nextInt();
		char ch1 = sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		switch(ch1) {
		case '+' :
			System.out.println(""+num1+ch1+num2+" = "+(num1+num2));
			break;
		case '-' :
			System.out.println(""+num1+ch1+num2+" = "+(num1-num2));
			break;
		case '*' :
			System.out.println(""+num1+ch1+num2+" = "+(num1*num2));
			break;
		case '/' :			
			System.out.println(""+num1+ch1+num2+" = "+(double)num1/num2);
			break;
		case '%' :
			System.out.println(""+num1+ch1+num2+" = "+(num1%num2));
			break;
		default :
			System.out.println("Not operator");
			}
		}catch(InputMismatchException e) {
			System.out.println("Wrong Input");
		}
		catch(ArithmeticException e) {
			System.out.println("Not operation");
		}
		catch(Exception e){
			System.out.println("Exception");
		}
		test1();
		test2();
		sc.close();
		}
	public static void test1() {
		try {
			System.out.println((1/0));
		}
		catch(Exception e) {
			System.out.println("Exception!!!!");
			return;
		}
		finally {
			System.out.println("method1 Exit");
		}
	}
	public static void test2() {
		try {
			System.out.println((1/0));
		}
		catch(Exception e) {
			System.out.println("Exception!!!!");
			return;
		}
		System.out.println("method2 Exit");
	}	
}
