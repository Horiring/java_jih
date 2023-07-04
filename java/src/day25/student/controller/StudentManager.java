package day25.student.controller;

import java.util.ArrayList;
import java.util.Scanner;

import day25.student.vo.Student;

public class StudentManager implements Program{
	private static final int EXIT=3;
	private static Scanner sc = new Scanner(System.in);
	private	ArrayList<Student> list = new ArrayList<>();

	@Override
	public void run() {
		int menu;
		do {
			printMenu();
			
			menu = sc.nextInt();
			
			runMenu(menu);
		}
		while(menu != EXIT );
		
	}
	@Override
	public void runMenu(int menu) {
		switch (menu) {
		case 1:	
			inputStudent();
			break;
		case 2:
			checkStudent();
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("Wrong menu!");
		}
		
	}
	private void checkStudent() {
		System.out.println("학번을 입력해주세요.");
		int classNum = sc.nextInt();
		
		Student tmp = new Student(classNum,null,null);
		int index = list.indexOf(tmp);
		if(index == -1) {
			System.out.println("존재하지 않습니다.");
			return;
		}
		System.out.println(list.get(index));
		
	}
	private void inputStudent() {
		System.out.println("학번을 입력해주세요.");
		int classNum = sc.nextInt();
		System.out.println("이름을 입력해주세요.");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("전공을 입력해주세요.");
		String major = sc.nextLine();
		Student tmp = new Student(classNum, name,major);
		if(!list.contains(tmp)) {
			list.add(tmp);
			System.out.println("정보를 추가했습니다.");
			return;
		}
		System.out.println("실패!");
	}
	@Override
	public void printMenu() {
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 확인");
		System.out.println("3. 종료");
		System.out.print("Select Menu : ");
	}
	
}
