package day8.practice;

import java.util.Scanner;

public class MethodSeasonEx {

	public static void main(String[] args) {
		//월을 입력받아 계절을 출력하는 코드를 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요. (1~12까지)");
		int num= sc.nextInt();
		seson(num);
		sc.close();
	}
	
	public static void seson(int num1) {
		switch(num1) {
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
