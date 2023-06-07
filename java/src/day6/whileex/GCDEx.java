package day6.whileex;

import java.util.Scanner;

public class GCDEx {

	public static void main(String[] args) {
		
		/*
		 * 약수 : 나누어 떨어지는 수
		 * 공약수 : 공통으로 있는 약수
		 * 최대 공약수 : 공약수 중 가장 큰 수
		 * 8과 12의 공약수 : 1,2,4
		 * 8과 12의 최대 공약수 : 4
		 */
		int num1,num2;
		int min=0, result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요.");
		num1=sc.nextInt();
		num2=sc.nextInt();
		min = num1>num2 ? num2 : num1;
		int i=1;
		while(i<=min) {
			if(num1%i==0 && num2%i==0) {
				result = i;
			}
			i++;
		}
		System.out.println("두 정수의 최대공약수는 "+result+" 입니다.");
		sc.close();
	}

}
