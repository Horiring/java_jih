package day18.practice;

import java.util.regex.Pattern;

public class RegexEx1 {

	public static void main(String[] args) {
		String str = "http://www.naver.com";
		String regex = "^https?://[a-zA-Z|\\.]+$";
		boolean result = Pattern.matches(regex, str);
		System.out.println(str+" : " +result);

	}

}
