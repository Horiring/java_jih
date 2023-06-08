package day7.practice;

public class PrintAlphabetEx2 {

	public static void main(String[] args) {

		for (char i = 'a'; i <= 'z'; i++) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
