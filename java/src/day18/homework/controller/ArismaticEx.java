package day18.homework.controller;

import java.util.Scanner;

public class ArismaticEx {
	/*
	산술연산을 하는 프로그램을 작성하세요.
	인터페이스 이용
	(package : day18.homework, file : ArithmeticEx)
	public interface Program{
		void run();
		void printMenu();
		void runMenu(int menu);
	}
	*/
	private Scanner sc = new Scanner(System.in);
	int menu = -1;
	final int EXIT = 6;
public void run() {
	//반복 : 선택한 메뉴가 종료가 아닐때
	do {
		//메뉴 출력
		printMenu();
		
		//메뉴 선택
		menu = sc.nextInt();
		
		//선택한 메뉴에 따른 기능을 실행
		runMenu(menu);
		
	}while(menu != EXIT);
	System.out.println("프로그램 종료!!");
	}
private void printMenu() {
	System.out.println("================");
	System.out.println("메뉴");
	System.out.println("1. +");
	System.out.println("2. -");
	System.out.println("3. *");
	System.out.println("4. /");
	System.out.println("5. %");
	System.out.println("6. 프로그램 종료");
	System.out.print("메뉴 선택 : ");
}
private void runMenu(int menu) {
	System.out.println("================");
	int result=0;
	System.out.println("두 정수를 입력해주세요.");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	switch(menu) {
	case 1:	
		result=num1+num2;
		System.out.println(""+num1+" + "+num2+" = "+result);
		break;
	case 2:
		result=num1-num2;
		System.out.println(""+num1+" - "+num2+" = "+result);
		break;
	case 3:	
		result=num1*num2;
		System.out.println(""+num1+" * "+num2+" = "+result);
		break;
	case 4:
		result=num1/num2;
		System.out.println(""+num1+" / "+num2+" = "+result);
		break;
	case 5:	
		result=num1%num2;
		System.out.println(""+num1+" % "+num2+" = "+result);
		break;
	case 6:	
		break;
	default:
		System.out.println("잘못된 메뉴!");
	}
}

}
