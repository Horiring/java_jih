package day5.switchex;

import java.util.Scanner;

public class SeasonEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요. (1~12까지)");
		int num= sc.nextInt();
		switch(num) {
		case 3 : case 4 : case 5 :
			System.out.println("봄");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("여름");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("가을");
			break;
		case 12 : case 1 : case 2 :
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못된월입니다");
		}

	}

}
