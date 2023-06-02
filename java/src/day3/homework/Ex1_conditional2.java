package day3.homework;

import java.util.Scanner;

public class Ex1_conditional2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender : ");
		String gender = sc.next(); 
		boolean result = gender.equals("W") ? true : false;
		System.out.println("Are you a women? "+result);
		sc.close();
	}
}
