package day25.practice;

public class Test7 {

	public static void main(String[] args) {
		System.out.println(sum(10,20));
		System.out.println(sum(10.4,12.2));
	}
	//메서드 오버로딩: 메서드명이 같고 매개변수가 다를 떄
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
}