package day11.array;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		/* 학생들의 국어 성적을 저장하기 위한 배열
		 * 
		 */
		double result = 0;
		double avg=0;
		double [] studentKoreanScore = new double[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3;i++) {
			System.out.println("input : ");
			studentKoreanScore[i] =sc.nextDouble();
		}
		for(int i = 0; i<3; i++) {
			System.out.println(studentKoreanScore[i]);
			
		}
		/* 학생 3명의 국어점수 평균을 구하고 출력하는 코드를 작성하세요
		 * 
		 */
		for (int i =0; i<3 ;i++)
		{
			result += studentKoreanScore[i];
		}
		avg = result / 3.0;
		System.out.println(avg);
		sc.close();		 
	}

}
