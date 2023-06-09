package day8.homework;

import java.util.Scanner;

public class MethodScoreEx {

	public static void main(String[] args) {
		// 성적을 입력받아 학점을 출력하는 코드를 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		int grade = sc.nextInt();
		score(grade);
	}
	public static void score(int grade) {
		if(grade>=90 && grade<=100) {
			System.out.println("A");
		}
		else if(grade>=80 && grade<90) {
			System.out.println("B");
		}
		else if(grade>=70 && grade<80) {
			System.out.println("C");
		}
		else if(grade>=60 && grade<70) {
			System.out.println("D");
		}
		else if(grade>=0 && grade<60){
			System.out.println("F");
		}
		else {
			System.out.println("wrong score");
		}
	}
}
