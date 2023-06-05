package day5.switchex;

import java.util.Scanner;

public class EvenEx {

	public static void main(String[] args) {
		// 홀짝 예제를 switch문으로
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		num = sc.nextInt();
		
		switch(num % 2) {
		case 0:
			System.out.println("짝수입니다.");
			break;
		default:
			System.out.println("홀수입니다.");
		}

	}

}
