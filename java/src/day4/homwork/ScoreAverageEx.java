package day4.homwork;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {
		//국어, 영어, 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 성적을 입력하세요.");
		int kor = sc.nextInt();
		System.out.println("영어 성적을 입력하세요.");
		int eng = sc.nextInt();
		System.out.println("수학 성적을 입력하세요.");
		int math = sc.nextInt();
		
		double avg=(double)(kor+eng+math)/3;
		System.out.println("평균 "+avg+"점 입니다.");
	}

}
