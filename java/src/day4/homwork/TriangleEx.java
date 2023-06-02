package day4.homwork;

import java.util.Scanner;

public class TriangleEx {

	public static void main(String[] args) {
	/*
 	 * 세 변의 길이를 정수로 입력받아 세 변으로 삼각형을 만들 수 있는지 확인하는 코드를 작성하세요.
	(package : day4.homework, file : TriangleEx)
	세 변 중 작은 두 변의 길이의 합이 큰 변보다 커야 삼각형을 만들 수 있다.
	input 3 integer num : 
	1 2 3 
	Unable to create triangle.
	input 3 integer num : 
	2 2 3 
	Able to create triangle.
	 */
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요.");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int result=0;
		if((num+num2)>num3 || (num2+num3)>num ||(num+num3)>num2) {
			System.out.println("삼각형을 만들수있습니다.");
		}
		else {
			System.out.println("불가능합니다.");
		}
		
		/*
		if(num>num2 && num>num3) {
			result = num2+num3;
			if(num<result) {
				System.out.println("삼각형을 만들수있습니다.");
			}
			else{
				System.out.println("불가능합니다.");
			}
		}
		else if(num2>num && num2>num3) {
			result = num+num3;
			if(num2<result) {
				System.out.println("삼각형을 만들수있습니다.");
			}
			else{
				System.out.println("불가능합니다.");
			}
		}
		else if(num3>num2 && num3>num) {
			result = num+num2;
			if(num3<result) {
				System.out.println("삼각형을 만들수있습니다.");
			}
			else{
				System.out.println("불가능합니다.");
			}
		}
		else if(num==num2 && num==num3) {
			System.out.println("삼각형을 만들수있습니다.");
		}
		else
			System.out.println("불가능합니다.");
		}
	*/
	}
}