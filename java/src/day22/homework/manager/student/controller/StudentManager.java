package day22.homework.manager.student.controller;

import java.util.Scanner;

public class StudentManager implements Program{
	private static final int EXIT=5;
	private Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		int menu;
		do {
			printMenu();
			
			menu = sc.nextInt();
			
			runMenu(menu);
			
		}while(menu != EXIT);
		
		
	}

	@Override
	public void runMenu(int menu) {
		switch (menu) {
		case 1:
		
			break;
		case 2:
			break;
		case 3:
		
			break;
		case 4:
			System.out.println("프로그램 종료");
		default:
			System.out.println("Wrong menu!");
		}
		
	}
	@Override
	public void printMenu() {
		System.out.println("1. 학생전체 출력");
		System.out.println("2. 학년 출력");
		System.out.println("3. 학생 검색");
		System.out.println("4. 프로그램 종료");
		System.out.print("Select Menu : ");
		
	}

}
