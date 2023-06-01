package day3.practice;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		//성적을 입력받아 입력받은 성적이 60점이상인지 확인하는 코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요.");
		int grades = sc.nextInt();
		System.out.println("성적이 60이상입니까? "+(grades >= 60));		
		
		
		sc.close();

	}

}
