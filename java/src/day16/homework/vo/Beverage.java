package day16.homework.vo;

import lombok.Data;

@Data
public class Beverage {
	//매개변수
	private String name;//제품명
	private int price;//가격
	private int amount;//잔돈
	//생성자
	public Beverage(String name, int price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	//메서드
	
}
