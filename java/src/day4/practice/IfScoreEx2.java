package day4.practice;

import java.util.Scanner;

public class IfScoreEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		int grade = sc.nextInt();
	/*
	 * grade가 0미만이거나 100초과이면 wrong grade!
	 * score가 90이상이면 A
	 * 	
	 */
		if(grade>100 || grade<0) {
			System.out.println("wrong score");
		}
		else if(grade>=90) {
			System.out.println("A");
		}
		else if(grade>=80) {
			System.out.println("B");
		}
		else if(grade>=70) {
			System.out.println("C");
		}
		else if(grade>=60){
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		sc.close();
	}

}
