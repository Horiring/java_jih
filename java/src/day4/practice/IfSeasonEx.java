package day4.practice;

import java.util.Scanner;

public class IfSeasonEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int num= sc.nextInt();
		
		if(num==3 || num==4 || num==5) {
			System.out.println("봄");
		}
		else if(num==6 || num==7 || num==8) {
			System.out.println("여름");			
		}
		else if(num==9 || num==10 || num==11) {
			System.out.println("가을");			
		}
		else if(num==12 || num==1 || num==2) {
			System.out.println("겨울");			
		}
		else {
			System.out.println("잘못된 월");
		}
		sc.close();
		
		//월이 3이상이 5이하이면 봄이라고 출력
		if(num>=3 && num<=5) {
			System.out.println("봄");
		}
		/*
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
		*/
	}

}
