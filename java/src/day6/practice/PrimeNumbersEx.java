package day6.practice;

public class PrimeNumbersEx {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i <= 100; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
			count = 0;
		}

	}

}
