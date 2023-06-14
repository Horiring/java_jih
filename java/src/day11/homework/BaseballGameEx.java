package day11.homework;

import java.util.Scanner;

public class BaseballGameEx {

	public static void main(String[] args) {
		// 1~9 사이의 중복되지 않은 세 수를 맞추는 게임.
		/*	B: 같은 숫자가 잇지만 위치가 다름
		 *  S: 같은 숫자가 있고 위치가 같음
		 *  30 : 일치하는 숫자가 하나도 없음
		 */ 
		Scanner sc = new Scanner(System.in);
		int min=1;
		int max=9;
		int arr[]= new int[3];
		int random =(int) (Math.random() * (max - min + 1) + min);
		int count = 0;
		while (count < 3) {
			random = (int) (Math.random() * (max - min + 1) + min);
			if(!contains(arr,random,count)) {	
				arr[count]=random;
				System.out.print(arr[count]+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("세개의 정수를 입력해주세요 ex(1 3 5)" );
		int a[] = new int[arr.length];
		for(int i =0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		for(int i =0;i<arr.length;i++) {
		if(arr[i]==a[i]) {
			System.out.print("s ");
		}
		else if(arr[i]==a[i]) {
			System.out.print("b ");
		}
		else {
			System.out.print("30 ");
		}
		}
		
		
	}
	public static boolean contains(int arr[], int num, int count) {
		for (int i = 0; i < count; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		return false;
	}
	public static void createRandomArray(int min, int max, int arr[]) {
		if(arr== null) {
			return;
		}
		int random = (int) (Math.random() * (max - min + 1) + min);
		if(max -min +1<arr.length) {
			return;
		}
			int count = 0;
			while (count < 3) {
				random = (int) (Math.random() * (max - min + 1) + min);
				if(!contains(arr,random,count)) {
					arr[count]=random;
					count++;
				}
			}
	}
}
