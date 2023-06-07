package day6.practice;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		/*
		 * 한판이 끝나면 더 할 것인지를 물어서 n을 입력하면 종료 , y를 입력하면 이어서 게임이 진행
		 */
		int min = 1, max = 100;
		int random = (int) (Math.random() * (max - min + 1) + min);
		int num = min - 1; // 1~100 이 아닌 정수로 초기화 하면 됨. 최소값 -1 해서 랜덤으로 나올 수 없는 수
		// System.out.println("정답: "+random);
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		do {
			random = (int) (Math.random() * (max - min + 1) + min);

			do {

				System.out.println("input number (1~100사이)");
				num = sc.nextInt();
				if (num > random) {
					System.out.println("Down!");
				} else if (num < random) {
					System.out.println("Up!");
				} else {
					System.out.println("정답입니다.");

				}
			} while (random != num);
			{
				System.out.println("계속하시겠습니까? (y/n)");
				ch = sc.next().charAt(0);
			}
		} while (ch != 'n');
		{
			System.out.println("Exit");
		}
		sc.close();
	}
}
