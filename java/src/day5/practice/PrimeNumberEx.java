package day5.practice;

import java.util.Scanner;

public class PrimeNumberEx {

	public static void main(String[] args) {
		// 소수구하기
		int a;
		int i=1;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		a = sc.nextInt();
		while(i<=a) {
			if(a%i==0) {
				count++;
				}		
			i++;
		}
			if(count==2) {
				System.out.println("소수입니다.");
			}
			else {
					System.out.println("소수가 아닙니다.");
				}
			sc.close();
	}
}



