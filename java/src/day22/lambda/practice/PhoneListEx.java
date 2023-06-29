package day22.lambda.practice;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import day22.lambda.practice.vo.Student;
import lombok.AllArgsConstructor;
import lombok.Data;

public class PhoneListEx {
	static ArrayList<Number> list = new ArrayList<>();
	static final int EXIT=4;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int menu=0;
		do {
			System.out.println(list);
			System.out.println("1. 전화번호 등록");
			System.out.println("2. 전화번호 수정");
			System.out.println("3. 전화번호 검색");
			System.out.println("4. 프로그램 종료");
			System.out.print("Select Menu : ");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				insertNumber();
				break;
			case 2:
				updateNumber();
				break;
			case 3:
				searchNumber();
				break;
			case 4:
				System.out.println("프로그램 종료");
			default:
				System.out.println("Wrong menu!");
				
			}
		}while(menu!=EXIT);
	}

	private static void searchNumber() {
		System.out.print("이름을 입력해주세요 : ");
		sc.nextLine();
		String name =sc.nextLine();
		for(Number tmp:list) {
			if(tmp.equals(name)) {
				System.out.println();
			}
		}
	}
		

	private static void updateNumber() {
		System.out.print("이름을 입력해주세요 : ");
		sc.nextLine();
		String name =sc.nextLine();
		System.out.print("변경할 전화번호를 입력해주세요. : ");
		int number = sc.nextInt();
		if(list.equals(name)) {
			list.add(new Number(number,name));
		}
	}

	private static void insertNumber() {
		System.out.print("전화번호를 입력해주세요 : ");
		int number =sc.nextInt();
		System.out.print("이름을 입력해주세요 : ");
		sc.nextLine();
		String name =sc.nextLine();
		list.add(new Number(number,name));
	}
}

@Data
@AllArgsConstructor
class Number{
	int number;
	String name;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Number other = (Number) obj;
		return Objects.equals(name, other.name) && number == other.number;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, number);
	}
}
