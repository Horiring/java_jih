package day11.practice;

public class ArrayRandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10사이 랜덤한 수 3개 만들어서 배열에 저장한 후 출력하는 코드

		int min = 1, max = 10;
		int random = 0;
		int [] randomArr = new int[3];

		for (int i = 0; i < 3; i++) {
			random = (int) (Math.random() * (max - min + 1) + min);
			randomArr[i] = random;
			System.out.println(randomArr[i]);
		}

	}

}
