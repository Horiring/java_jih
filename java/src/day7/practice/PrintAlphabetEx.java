package day7.practice;

public class PrintAlphabetEx {

	public static void main(String[] args) {
		// a~z

		for (char i = 'a'; i <= 'z'; i++) {

			System.out.println(i);
		}

		char ch = 'a';
		for (int i = 0; i < 26; i++) {

			System.out.print((char)(ch+i));
		}

	}

}
