package day18.string;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
		String fruits = "사과,오렌지,바나나";
		
		StringTokenizer st = new StringTokenizer(fruits,",");
		//hasMoreTokens : 다음 토큰이 있는지 없는지 알려줌
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			//nextToken:토큰을 가져옴
		}

	}

}