package day3.homework;

import java.util.Scanner;

public class Ex2_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender : ");
		char gender = sc.next().charAt(0); 
		//String result = gender=='W' ? "woman":"man";
		String result ="";
		if(gender=='W') {
			//System.out.println("are you a women? "+"woman");
			result="Woman";
		}
		if(gender=='M') {
			//System.out.println("are you a women? "+"man");
			result="Man";
		}
		System.out.println("are you a women? "+result);
		
		sc.close();
	}

}
