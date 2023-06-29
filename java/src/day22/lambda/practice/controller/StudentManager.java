package day22.lambda.practice.controller;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import day22.lambda.practice.vo.Student;

public class StudentManager implements Program {
	private static final int EXIT = 4;
	private Scanner sc = new Scanner(System.in);
	private List<Student> list =Arrays.asList(
			new Student(1,1,1,"Hong"),
			new Student(1,1,2,"Ling"),
			new Student(2,1,1,"Park"),
			new Student(3,1,1,"Lee")			
			); 
	
	@Override
	public void printMenu() {
		System.out.println("1. 학생전체 출력");
		System.out.println("2. 학년 출력");
		System.out.println("3. 학생 검색");
		System.out.println("4. 프로그램 종료");
		System.out.print("Select Menu : ");
	}
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
		int grade, classNum, num;
		switch (menu) {
		case 1:
			printStudent();
			break;
		case 2:
			System.out.print("검색할 학년 입력 : ");
			grade = sc.nextInt();
			printGrade(grade);
			break;
		case 3:
			System.out.print("학년 반 번호 입력 : ");
			grade = sc.nextInt();
			classNum = sc.nextInt();
			num = sc.nextInt();
			searchStudent(grade,classNum,num);
			break;
		case 4:
			System.out.println("프로그램 종료");
		default:
			System.out.println("Wrong menu!");
		}
		
		
	}
	private void searchStudent(int grade,int classNum, int num) {
		for(Student tmp:list) {
			if(tmp.equals(new Student(grade,classNum,num,"")))
				System.out.println(tmp);
			}
		}
	private void printGrade(int grade) {
		for(Student tmp:list) {
			if(tmp.getGrade()==grade) {
				System.out.println(tmp);
			}
		}
	}
	private void printStudent() {
		for(Student tmp : list) {
			System.out.println(tmp);
		}
	}
	
}



