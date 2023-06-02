package day4.practice;

import java.util.Scanner;

public class Prack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요.");
		int score = sc.nextInt();
		char grade;
		if(score>=90) {
			grade='A';
			System.out.println(grade+" 입니다.");
		}
		else if(score<=79 && score >=70) {
			grade='B';
			System.out.println(grade+" 입니다.");
		}
		else if(score<=69 && score >=60) {
			grade='C';
			System.out.println(grade+" 입니다.");
		}
		else if(score<=59 && score >=50){
			grade='D';
			System.out.println(grade+" 입니다.");
		}
		else {
			grade='F';
			System.out.println(grade+" 입니다.");
		}
	}

}
