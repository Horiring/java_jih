package day6.homework;

import java.util.Scanner;

public class DisjointEx {

	public static void main(String[] args) {
/*
 * 두 정수를 입력받아 두 정수가 서로소 관계인지 판별하는 코드를 작성하세요.
	(package : day6.homework, file : DisjointEx)
	서로소 : 최대 공약수가 1인 두 수의 관계
	input 2 numbers : 3 4
	Disjoint!(서로소)
	input 2 numbers : 8 4
	Not disjoint!(서로소 아님)
 */
		int num1,num2;
		int min=0, gdc=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요.");
		num1=sc.nextInt();
		num2=sc.nextInt();
		min = num1>num2 ? num2 : num1;
		int i=1;
		while(i<=min) {
			if(num1%i==0 && num2%i==0) {
				gdc= i;
			}
			i++;
		}
		if(gdc==1) {
			System.out.println("서로소 입니다.");
		}
		else {
			System.out.println("서로소가 아닙니다.");
		}
		
		sc.close();
	}

}
