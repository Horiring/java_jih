package day3.practice;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input score");
		int grades = sc.nextInt();
		String str= grades>=60 ?"Pass":"Failed";
		System.out.println("Do you pass "+grades+" points? "+str);		
		
		
		sc.close();
	}

}
