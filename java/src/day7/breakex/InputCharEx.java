package day7.breakex;

import java.util.Scanner;

public class InputCharEx {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		for(; ;) {
			System.out.println("input char (elxt : q) : ");
			ch = sc.next().charAt(0);
			if(ch=='q') {
				break;
			}
		}
	}

}
