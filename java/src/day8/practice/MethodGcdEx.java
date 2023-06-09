package day8.practice;

import java.util.Scanner;

public class MethodGcdEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("최대공약수는 "+GCD(num1,num2)+" 입니다.");
		
		
		int gcd = gcd(num1,num2);
		System.out.println(gcd);
		sc.close();
		
		
	}
	
	public static int GCD(int num1 ,int num2) {
		int result = 0;
		int min = num1>num2?num2:num1;
		
		for(int i=2; i<=min ; i++) {
			if(num1%i==0 && num2%i==0) {
				result=i;
			}
		}
		return result;
	}
	public static int gcd(int num1,int num2) {
		for (int i = num1; i>=1;i--) {
			//i가 num1의 약수이다 == num1은 i의 배수이다.
			if(Multiple(num1,i) && Multiple(num2,i)) {
				return i;
			}
			
		}
		return 0;
	}
	public static boolean Multiple(int num1, int num2) {
		return num1%num2==0;
	}
}
