package day2.homwork;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int num1 = sc.nextInt(),num2 = sc.nextInt();
		System.out.println("연산자를 입력하세여!");
		sc.nextLine();
		String str1 = sc.nextLine(); 
		System.out.println(num1+str1+num2);
	}

}
