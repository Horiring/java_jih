package day8.homework;

import java.util.Scanner;

public class MethodMonthEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();

		String season = getMonth(month);
		System.out.println(month + " is " + month);

		System.out.println(month + " is " + getMonth(month));

		sc.close();

	}

	public static String getMonth (int month) {
		String eng=" ";
		switch(month) {
		case 1:
			eng="january";
			break;
		default:
		}
		return eng;
	}
}
