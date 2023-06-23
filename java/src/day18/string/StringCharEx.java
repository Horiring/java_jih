package day18.string;

import java.util.Scanner;

public class StringCharEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		String str = "Hello world";
		int count =0;
		
		System.out.println("문자열을 입력해주세요.");
		char chr = sc.next().charAt(0);
		
		for(int i=0;i<str.length();i++) {
			if(chr==str.charAt(i)) {
				count++;
			}
		}
		
		System.out.println(chr+" : "+count);
		*/
		
		int alphabet[] = new int[26];//각 알파벳 개수를 저장하는 배열. 0번지:
		//a의개수. 1번지:b의 개수
		
		
		System.out.print("input : ");
		String str = sc.nextLine();
		
		for(int i = 0 ; i < str.length();i++) {
			char ch =str.charAt(i);
			//ch가 알파벳 소문자인 경우 0~25사이의 값이 나옴
			int distance = ch-'a';
			//영문 소문자가 아닌 경우
			if(distance<0 || distance > 25) {
				continue;
			}
			//맞는 경우
			alphabet[distance]++;
		}
		System.out.println();
		//알파벳 개수 추가	
		for(int i = 0; i<alphabet.length;i++) {
			if(alphabet[i]==0) {
				continue;
			}
			System.out.println((char)('a'+i)+" : "+alphabet[i]);
		}
		sc.close();
	}

}
