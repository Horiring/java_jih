package day9.classex;

public class Carmain {

	public static void main(String[] args) {
		/* 
		 * 현대 뉴 아반뗴 2023년식 자동차 객체를 생성하는 코드를 작성하세요
		 */
		Car myCar = new Car("뉴 아반떼","현대",2023);
		//현재 내 차 정보를 조회
		myCar.turn();
		myCar.setGear('D');
		myCar.printInfo();
		myCar.speedChange(false);
		myCar.speedChange(false);
		myCar.speedChange(false);
		myCar.printInfo();

		myCar.speedChange(true);
		myCar.speedChange(true);
		myCar.speedChange(true);
		myCar.printInfo();
		myCar.speedChange(false);
		myCar.printInfo();
	}

}
