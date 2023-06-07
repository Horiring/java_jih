package day6.dowhileex;

import java.util.Scanner;

public class PrintMenuEx {

	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. Start");
			System.out.println("2. Save");
			System.out.println("3. Exit");
			System.out.print("Select Menu : ");
			i = sc.nextInt();
			
			//switch 가능
			if(i==1) {
			System.out.println("Program Start!");
			}
			else if(i==2) {
			System.out.println("Program Save!");
			}
			else if(i==3) {
			System.out.println("Program Exit!");
			}
			else {
			System.out.println("잘못입력했습니다.");
			i = sc.nextInt();
			}
		}
		while(i!=3);
		{
		
			}
		sc.close();
	}
}
