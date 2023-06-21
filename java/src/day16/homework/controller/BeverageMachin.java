package day16.homework.controller;

import java.util.Scanner;

import day15.practice.shop.vo.Product;

public class BeverageMachin {
	//음료수를 뽑는 자판기 프로그램을 작성하세요.
	//단 음료수 자판기에 음료수는 사이다,콜라,환타가 고정이라고 가정
	//메뉴를 선택하면 음료수와 잔액이 나옴(출력)
	//1.금액투입
	//2.메뉴선택
	//3.제품입고
	//4.프로그램 종료
	//메뉴 선택 : 2
	//1. 사이다
	//2. 콜라
	//3. 환타
	//음료 선택 : 1
	//사이다를 선택했습니다
	//사이다가 나옵니다.[금액이 충분한 경우]
	//잔돈 xxx가 나옵니다
	//금액이 부족합니다.[금액이 부족한 경우]
	//잔돈 xx이 안옵니다.
	Scanner sc = new Scanner(System.in);
	private Product list[] = new Product[10];
	private int count = 0;// 저장된 제품 개수
public void run() {
			// 반복(종료를 선택하기 전까지) => 무조건 1번은 실행
			
			int menu = -1;
			final int EXIT = 4;
			do {
				// 메뉴 출력
				printMenu();
				// 메뉴 선택
				menu = sc.nextInt();
				// 메뉴에 따른 기능 실행
				runMenu(menu);

			} while (menu != EXIT);
			System.out.println("프로그램 종료");
			sc.close();
		}

private void printMenu() {
			System.out.println("메뉴");
			System.out.println("1. 금액 투입");
			System.out.println("2. 메뉴 선택");
			System.out.println("3. 제품 입고");
			System.out.println("4. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
}
private void runMenu(int menu) {
	switch (menu) {
		//1.금액투입
	case 1:
		input();
		break;
		//2.메뉴선택
	case 2:
		selectMenu();
		break;
		//3.제품입고
	case 3:
		recevingProduct();
		break;
	case 4:
		System.out.println("=============");
		break;
	// 메뉴가 그외이면 잘못된 메뉴라고 출력
	default:
		System.out.println("=============");
		System.out.println("잘못된 메뉴 선택");
		System.out.println("=============");
	}
}

private void programType() {
	// TODO Auto-generated method stub
	
}

private void recevingProduct() {
	// TODO Auto-generated method stub
	
}

private void selectMenu() {
	printselectMenu();
	System.out.print("번호를 입력해주세요 : ");
	int drink = sc.nextInt();
	switch(drink) {
	case 1:
		System.out.println("사이다를 선택했습니다.");
		break;
	case 2:
		System.out.println("콜라를 선택했습니다.");
		break;
	case 3:
		System.out.println("환타를 선택했습니다.");
		break;
	default:
		System.out.println("없는 번호입니다.");
	}
	
}
private void printselectMenu() {
	System.out.println("===========");
	System.out.println("1.사이다 (700원)");
	System.out.println("2.콜라 (800원)");
	System.out.println("3.환타 (600원)");
}
private void input() {
	System.out.println("금액을 투입해주세요 : ");
	int amount = sc.nextInt();
			
}
private void changeMoney() {
	
}
}