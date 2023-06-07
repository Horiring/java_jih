package day6.whileex;

import java.util.Scanner;

public class AverageEx {

	public static void main(String[] args) {
		int kor,eng,math;
		double avg= 0;
		char ch='y';
		Scanner sc = new Scanner(System.in);
		
		while(ch !='n') {
		System.out.println("국어점수를 입력하세요.");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요.");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요.");
		math = sc.nextInt();
		avg = (double)(kor+eng+math)/3;
		System.out.println("평균값은 "+avg+"입니다.");
		
		System.out.println("계속하시겠습니까? (y/n)");
		ch=sc.next().charAt(0);
		}
		System.out.println("Exit");
		sc.close();
	}

}
