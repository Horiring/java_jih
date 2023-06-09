package day8.practice;

import java.util.Scanner;

public class MethodEvenNumberEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		even(num);
		System.out.println(even2(num));
		
		if(mod(num,2)==0){
			System.out.println("짝");
		}
		else {	
		System.out.println("홀");
		}
		if(isEvenNumber(num)){
			System.out.println("짝");
		}
		else {	
		System.out.println("홀");
		}
		if(isMultiple(num,2)){
			System.out.println("짝");
		}
		else {	
		System.out.println("홀");
		}
		
	}
	public static void even (int num1) {
		if(num1%2==0) {
			System.out.println("짝수 입니다.");
		}
		else {
			System.out.println("홀수 입니다.");
		}
	}
	
	public static String even2(int num1) {
		return num1%2==0 ? "짝"  : "홀" ; 
	}
	/**
	 * num1과 num2가 주어지면 num1을 num2로 나누었을 때 나머지를 알려주는 메서드
	 * @param int num1,int num2
	 * @return	int
	 * 
	 */
	public static int mod(int num1, int num2) {
		return num1%num2;
	}
	
	/**
	 * num가 주어지면 num가 짝수인지 홀수인지 알려주는 메서드
	 * 매게변수 : 판별할 정수 =? int num
	 * 리턴타입 : 짝수인지(참) 홀수인지(거짓) =>
	 * 메서드명 : isEvenNumber
	 */
	public static boolean isEvenNumber(int num1) {
		return num1 % 2==0;
	}

	/**
	 * num가 주어지면 num가 배수인지 아닌지 알려주는 메서드
	 * 매게변수 : 판별할 정수 =? int num1,int num2
	 * 리턴타입 : 배수이면 참 아니면 거짓 =>boolean
	 * 메서드명 : isMultiple
	 */
	public static boolean isMultiple(int num1, int num2) {
		return num1%num2 ==0;
	}
	
}
