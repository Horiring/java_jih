package day18.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringSplitEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력하세요");
		String srt = sc.nextLine();
		String sp[] = srt.split(" ");
		
		System.out.println("word : "+sp.length);
		sc.close();
		
}

}
