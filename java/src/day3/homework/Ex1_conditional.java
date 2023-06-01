package day3.homework;

import java.util.Scanner;

public class Ex1_conditional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender : ");
		char gender = sc.next().charAt(0); 
		boolean result = gender=='W' ? true : false; 
		if(gender=='W') {
			System.out.println("are you a women? "+result);
		}
		if(gender=='M') {
			System.out.println("are you a women? "+result);
		}
	}
}
