package day22.lambda.practice.student.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import day22.lambda.practice.student.vo.Student;

public class StudentManager3 implements Program{
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
		Stream<Student> listStream = list.stream();
		switch (menu) {
		case 1:
			listStream.forEach(std->System.out.println(std));
			break;
		case 2:
			System.out.print("검색할 학년 입력 : ");
			int grade = sc.nextInt();		
			listStream.filter(num -> num.getGrade()==grade).forEach(num->System.out.println(num));
			break;
		case 3:
			System.out.print("학년 반 번호 입력 : ");
			final int grade2 = sc.nextInt();
			final int classNum2 = sc.nextInt();
			final int num2 = sc.nextInt();
			listStream.filter(std->std.equals(new Student(grade2,classNum2,num2,null)))
						.forEach(std->System.out.println(std));
			break;
		case 4:
			System.out.println("프로그램 종료");
		default:
			System.out.println("Wrong menu!");
		}
	}
}



