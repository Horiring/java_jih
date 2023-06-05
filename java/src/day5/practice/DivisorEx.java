package day5.practice;

import java.util.Scanner;

public class DivisorEx {

	public static void main(String[] args) {
		//약수 : A를 B로 나누었을 때 나머지가 0이면 B는 A의 약수이다.
		//12 의 약수 : 1 , 2, 3, 4, 6, 12
		int a;
		int i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		a = sc.nextInt();
		while(i<=a) {
			if(a%i==0) {
				System.out.print(i);
				if(i<a) {
					System.out.print(", ");
				}
			}
			i++;
		}
		sc.close();
	}

}
