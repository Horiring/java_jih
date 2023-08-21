package db.day3.board.controller;

import java.util.Scanner;

import db.day3.board.service.MemberService;
import db.day3.board.service.MemberServiceImp;
import db.day3.board.vo.MemberVO;

public class MemberController {
	
	private MemberService memberService = new MemberServiceImp();
	public void run() {
		int menu;
		final int EXIT = 3;
		Scanner sc = new Scanner(System.in);
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
		}while(menu != EXIT);		
	}

	private void runMenu(int menu) {
		switch(menu) {
		case 1:
			signup();
			break;
		case 2:
			widthdraw();
			break;
		case 3:
			break;
		default:
			System.out.println("[잘못된 메뉴 입력]");			
		}
	}

	private void widthdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		MemberVO member = new MemberVO(id,pw);
		
		if(memberService.withdraw(member)) {
			System.out.println("[회원 탈퇴 성공]");
		}else {
			System.out.println("[회원 탈퇴 실패]");
		}
	}

	private void signup() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.println("PW CONFIRM : ");
		String pw2 = sc.next();
		if(!pw.equals(pw2)) {
			System.out.println("[비번 불일치]");
			return;
		}
		MemberVO member = new MemberVO(id,pw);
		if(memberService.singup(member)) {
			System.out.println("[회원 가입 성공]");
		}else {
			System.out.println("[회원 가입 실패]");
		}
	}

	private void printMenu() {
		System.out.println("====회원관리====");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원탈퇴");
		System.out.println("3. 뒤로가기");
		System.out.print("메뉴 입력 : ");
	}


}
