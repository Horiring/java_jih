package day20.practice.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import day20.practice.vo.Student;



public class StudentEx implements Program{
	
	private	ArrayList<Student> list = new ArrayList<>();
	private Scanner sc =new Scanner(System.in);
		
		@Override
		public void run() {
			// 반복(종료를 선택하기 전까지) => 무조건 1번은 실행
			int menu = 0;
			final int EXIT = 4;
			do {
				try {
					System.out.println(list);
					// 메뉴 출력
					printMenu();
					// 메뉴 선택
					menu = sc.nextInt();
					// 메뉴에 따른 기능 실행
					runMenu(menu);
				}catch(InputMismatchException e) {
					menu = EXIT-1; //종료 메뉴가 아닌 아무 메뉴를 추가
					sc.nextLine();//앞에서 잘못 입력한 내용을 비워줌
					System.out.println("wrong input");
					
				}
			} while (menu != EXIT);
			System.out.println("프로그램 종료");
			sc.close();
		}
		@Override
		public void printMenu() {

			System.out.println("메뉴");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 삭제");
			System.out.println("3. 학생 수정");
			System.out.println("4. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
		}
		@Override
		public void runMenu(int menu) {
			switch (menu) {
			case 1:
				addStudent();
				break;
			case 2:
				removeStudent();
				break;
			case 3:
				updateStudent();				
				break;
			case 4:
				System.out.println("==========");
				System.out.println("프로그램 종료");
				break;
			default :
			}
		}

		private void updateStudent() {
			//수정할 학생의 정보를 입력
			System.out.println("학년을 입력해주세요.");
			int grade = sc.nextInt();
			System.out.println("반을 입력해주세요.");
			int classNum = sc.nextInt();
			System.out.println("번호를 입력해주세요.");
			int num = sc.nextInt();
			//수정할 학생이 있는지 없는지 확인
			//없으면 추가할건지 확인 후 추가
			Student tmp =new Student(grade, classNum, num, null);
			int index = list.indexOf(tmp);
			if(index == -1) {
				System.out.println("존재하지 않습니다.");
				return;
			}
			//수정될 학생 정보를 입력
			System.out.println("학년을 입력해주세요.");
			grade = sc.nextInt();
			System.out.println("반을 입력해주세요.");
			classNum = sc.nextInt();
			System.out.println("번호를 입력해주세요.");
			num = sc.nextInt();
			System.out.println("이름을 입력해주세요.");
			sc.nextLine();
			String name = sc.nextLine();
			
			//학생 정보를 수정
			//수정될 학생 정보가 이미 있는 학생인지 확인
			//수정될 정보를 이용하여 학생 객체를 생성
			tmp = new Student(grade, classNum, num, name);
			//학년,반,번호가 일치하는 학생이 있는지 확인해서 있으면 종료
			if(list.contains(tmp)) {
				System.out.println("Update fail!!");
				return;
			}
			list.get(index).update(grade,classNum,num,name);
			//list.set(index,new Student(grade,classNum,num,name));
		}
		private void removeStudent() {
			//삭제할 학생 정보를 입력
			System.out.println("학년을 입력해주세요.");
			int grade = sc.nextInt();
			System.out.println("반을 입력해주세요.");
			int classNum = sc.nextInt();
			System.out.println("번호를 입력해주세요.");
			int num = sc.nextInt();
			Student tmp = new Student(grade, classNum,num,null);
			if(list.remove(tmp)) {
				//삭제성공
				System.out.println("삭제 성공");
				return;
			}
			System.out.println("삭제 실패");
		}

		private void addStudent() {
			//추가할 학생의 정보를 입력
			System.out.println("학년을 입력해주세요.");
			int grade = sc.nextInt();
			System.out.println("반을 입력해주세요.");
			int classNum = sc.nextInt();
			System.out.println("번호를 입력해주세요.");
			int num = sc.nextInt();
			System.out.println("이름을 입력해주세요.");
			sc.nextLine();
			String name = sc.nextLine();
			//입력 정보를 이용하여 학생 객체를 생성
			Student std = new Student(grade, classNum, num, name);
			//학생 리스트에 추가
			//학생이 있는지 없는지 확인해서 없으면 추가
			if(!list.contains(std)) {
				list.add(std);
				System.out.println("정보를 추가했습니다.");
				return;
			}
			System.out.println("실패!");
		}
		public int indexOf(String name) {
			for(int i = 0; i<list.size(); i++) {
				if(list.get(i).getName().equals(name)) {
					return i;
				}
			}
			return -1;
		 }
}
