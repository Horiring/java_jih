package day5.practice;

public class RandomEx {

	public static void main(String[] args) {
		//min부터 max사이에 랜덤한 정수를 만드는 코드를 작성하세요.
		//Math.random() : 0이상 1미만의 실수를 랜덤으로 생성
		// 0 * (max-min+1)<= r < 1 * (max-min+1)
		//0+min < = r *(max-min+1)+min<max-min+1+min
		// min < r(max-min+1)+min<max+1
		int min=1,max=10;
		int random = (int)(Math.random()*(max-min+1)+min); //랜덤한 정수 생성하는 코드
		
		System.out.println(random);

	}

}
