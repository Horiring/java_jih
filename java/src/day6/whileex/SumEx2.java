package day6.whileex;

import java.util.Scanner;

public class SumEx2 {

	public static void main(String[] args) {
		int i = 1;
		int sum=0;;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int n = sc.nextInt();
		
		while(i<=n) {
			if(i%2==0) {
				sum += i;
			}
			i++;
		}
		System.out.println("짝수의합은 "+sum+"입니다.");
		
	}

}
