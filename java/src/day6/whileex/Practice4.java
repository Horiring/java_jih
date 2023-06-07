package day6.whileex;

public class Practice4 {

	public static void main(String[] args) {
		int n = 100;
		int answer = 0;
		int count = 0;
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; i++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				answer++;
			}
			count = 0;
		}
		System.out.println(answer);
	}

}
