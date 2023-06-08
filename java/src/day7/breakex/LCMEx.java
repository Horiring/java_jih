package day7.breakex;

import java.util.Scanner;

public class LCMEx {

	public static void main(String[] args) {
		// 두 정수를 입력받아 두 정수의 최소공배수를 구하는 코드를 작성하세요

		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		/*
		int result = 0;
		for (int i = 2; i <= (a*b); i++) {
			if (a % i == 0 && b % i == 0) {
				result = i;
				break;
			}
		}
		int result2=(a*b)/result;
		System.out.println("최소공약수는 " + result + " 입니다.");
		System.out.println("최소공배수는 " + result2 + " 입니다.");
		*/
		/*
		for(int i=1; i<=(a*b);i+=a) {
			if(i%a==0 && i%b==0) {
				System.out.println(i);
				break;
			}
		}
		*/
		for(int i=a;;i+=a) {
			if(i%b==0) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
}
