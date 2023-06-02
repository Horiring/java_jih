package day4.homwork;

import java.util.Scanner;

public class MaxEx {

	public static void main(String[] args) {
		//두 정수를 입력받아 두 정수 중 큰 수를 출력하는 코드를 작성하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		if(num>num2) {
			System.out.println(num);
		}
		else if(num<num2) {
			System.out.println(num2);
		}
		else {
			System.out.println("같습니다.");
		}

	}

}
