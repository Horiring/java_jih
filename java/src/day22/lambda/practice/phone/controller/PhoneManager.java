package day22.lambda.practice.phone.controller;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import day22.lambda.practice.phone.vo.PhoneBook;
import day22.lambda.practice.student.vo.Student;
import lombok.AllArgsConstructor;
import lombok.Data;

public class PhoneManager implements Program{
	private final static int EXIT = 4;
	private Scanner sc = new Scanner(System.in);
	private PhoneBook pb = new PhoneBook();
	@Override
	public void printMenu() {
		System.out.println("1. Insert");
		System.out.println("2. Update");
		System.out.println("3. Search");
		System.out.println("4. EXIT");
		System.out.print("Select Menu : ");
		
	}

	@Override
	public void run() {
		int menu;
		do {
			System.out.println("==========");
			printMenu();
			menu=sc.nextInt();
			runMenu(menu);
			System.out.println("==========");
		}while(menu != EXIT);
		
	}

	@Override
	public void runMenu(int menu) {
		
		switch(menu) {
		case 1: 
			insert();
			break;
		case 2: 
			update();
			break;
		case 3: 
			search();
			break;
		case 4: 
			System.out.println("종료");
			break;
		default : 
			System.out.println("잘못된 메뉴입력");
		}
		
	}

	private void search() {
		System.out.print("이름을 입력해주세요 : ");
		sc.nextLine();
		String name = sc.nextLine();
		
		pb.print(s->s.getName().contains(name));
	}

	private void update() {
		System.out.print("이름을 입력해주세요 : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("수정할 이름을 입력해주세요 : ");
		String updateName = sc.nextLine();
		System.out.print("수정할 전화번호를 입력해주세요 : ");
		String updateNumber = sc.nextLine();
		
		if(pb.update(name, updateName, updateNumber)) {
			System.out.println("성공");
		}
		else {
			System.out.println("실패");
		}
	}
	private void insert() {
		//이름과 전화번호를 입력
		System.out.print("이름을 입력해주세요 : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("전화번호를 입력해주세요 : ");
		String number = sc.nextLine();
		//전화번호부에 추가를 해서 성공하면 성공이라고
		if(pb.insertPhone(name, number)) {
			System.out.println("성공");
		}
		//실패하면 실패했다고 출력
		else {
			System.out.println("실패");
		}
	}

}
