package day15.practice.shop.vo;

import lombok.Data;

@Data
public class Customer {
	//멤버변수
	private String customerId;//고객이 추가되면 자동으로 발급
	//ex: CID00001
	private String name;
	private String phoneNumber;
	//고객 ID 발급을 위한 클래스변수
	//등록된 고객수
	private static int count;
	//고객 아이디 앞부분
	private final static String CID = "CID";
	//고객 아이디 뒷부분 숫자의 최대 길이
	private final static int MAX_SIZE=5;
	//생성자
	public Customer(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber=phoneNumber;
		generateCustomerID();//실행되면 customerId 발급이 완료.
	}
	//메서드
	private void generateCustomerID() {
		//1 => 00001
		//1 => "1"
		String num =""+ ++count; //문자열 +정수 => 문자열
		//"1".length==1
		int length = num.length();
		for(int i = 0;i<MAX_SIZE-length; i++) {
			num = "0"+num;
		}
		
		customerId =CID+num;
	}
	public void print() {
		System.out.println("=======================");
		System.out.println("고객번호 : "+customerId);
		System.out.println("고객이름 : "+name);
		System.out.println("전화번호 : "+phoneNumber);
	}
}
