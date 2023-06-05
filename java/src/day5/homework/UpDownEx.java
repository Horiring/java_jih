package day5.homework;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
/*
 * UpDown게임
	1~100사이의 랜덤한 정수를 생성하고, 이 정수를 맞추는 게임을 구현하세요.
	(package : day5.homework, file : UpDownEx)
	랜덤한 수 : 45
	input : 50
	Down!
	input : 40
	Up!
	input : 45
	Good!

 */
		int min=1, max=100;
		int random = (int)(Math.random()*(max-min+1)+min);
		int num= 0;
		System.out.println("정답: "+random);
		Scanner sc = new Scanner(System.in);
		System.out.println("input number (1~100사이)");
		while(num!=random) {
			
			num = sc.nextInt();
		if(num>random) {
			System.out.println("Down!");
		}
		else if(num<random){
			System.out.println("Up!");
		}
		else {
			System.out.println("정답입니다.");
		}
		}
		
	}	

}
