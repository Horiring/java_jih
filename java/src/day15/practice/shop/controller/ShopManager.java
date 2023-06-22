package day15.practice.shop.controller;

import java.util.Scanner;

import day15.practice.shop.vo.Customer;
import day15.practice.shop.vo.Product;
import day15.practice.shop.vo.Sales;
import day17.interfaceex.RunInterface;

public class ShopManager implements RunInterface {
		/*
		 * 메뉴
		 * 제품 판매 : 어떤 고객이 어떤 제품을 구매했는지 관리
		 * 제품 입고 : 새 제품이 추가됨 어떤 제품이 몆개 추가됐는지 관리
		 * 제품 조회 : 제품 정보 조회. 제품명으로 제품을 조회
		 * 매출 조회 : 판매된 제품 매출 조회. 누적 매출
		 * 고객 등록 : 고객을 추가하여 고객을 관리
		 * 프로그램 종료
		 */
		Scanner sc = new Scanner(System.in);
		private Product list[] = new Product[10];
		private int count = 0;// 저장된 제품 개수
		private Customer customerList[]=new Customer[10];
		private int customerCount = 0;
		private Sales salesHistory[] = new Sales[100];
		private int salesCount;//기록된 판매수
		private int totalPrice; //매출금액
		public void run() {
			// 반복(종료를 선택하기 전까지) => 무조건 1번은 실행
			int menu = -1;
			final int EXIT = 6;
			do {
				// 메뉴 출력
				printMenu();
				// 메뉴 선택
				menu = sc.nextInt();
				// 메뉴에 따른 기능 실행
				runMenu(menu);

			} while (menu != EXIT);
			System.out.println("프로그램 종료");
			sc.close();
		}

private void printMenu() {
			System.out.println("메뉴");
			System.out.println("1. 제품 판매");
			System.out.println("2. 제품 입고");
			System.out.println("3. 제품 조회");
			System.out.println("4. 매출 조회");
			System.out.println("5. 고객 등록");
			System.out.println("6. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
		}

private void runMenu(int menu) {
			switch (menu) {
			// 메뉴가 1이면 제품 판매 기능을 실행
			case 1:
				sell();
				break;
			// 메뉴가 2이면 제품 입고 기능을 실행
			case 2:
				store();
				break;
			// 메뉴가 3이면 제품 조회 기능을 실행
			case 3:
				printProduct();
				break;
			// 메뉴가 4이면 매출 조회 기능을 실행
			case 4:
				printSales();
				break;
			// 메뉴가 5이면 고객추가 기능을 실행
			case 5:
				registerCustomer();
				break;
			case 6:
				System.out.println("=============");
				break;
			// 메뉴가 그외이면 잘못된 메뉴라고 출력
			default:
				System.out.println("=============");
				System.out.println("잘못된 메뉴 선택");
				System.out.println("=============");
			}
		}

private void registerCustomer() {
			// TODO Auto-generated method stub
			//고객 정보(이름, 전화번호)를 입력
			System.out.print("고객이름 : ");
			String name = sc.next();
			System.out.print("전화번호 : ");
			String phonNumber = sc.next();
			
			//고객을 등록(고객 리스트에)
			//이미 등록된 전화번호이면 등록을 X
			for(int i = 0; i < customerCount ; i++) {
				if(customerList[i].getPhoneNumber().equals(phonNumber)) {
					System.out.println("등록된 번호! 고객등록 실패!");
					return;
				}
			}
			//새 전화번호이면 등록
			//입력받은 고객 정보를 이용하여 고객 객체를 생성한 후 , 마지막 고객 다음에 새 고객을 추가
			//등록된 고객의 수를 증가
			customerList[customerCount] = new Customer(name, phonNumber);
			customerCount++; 
		}
private void printSales() {
	//매출 내역 출력
	for(int i =0; i<salesCount; i++) {
		salesHistory[i].print();
	}
	//누적 매출액 출력
	
}
private void printProduct() {
	/*
		System.out.println("======================");
		for(int i = 0; i<count; i++) {
			list[i].print();
			System.out.println("======================");
			}
	*/	
			//검색할 제품을 입력
			System.out.println("제품명 : ");
			sc.nextLine();
			String name = sc.nextLine();
			//입력한 검색어 맞는 제품을 출력
			//등록된 제품들 중에 검색어와 일치하는 제품이 어디있는지 확인
			int index = indexOf(name);
			//제품이 있으면 제품 정보를 출력
			if(index >= 0) {
				list[index].print();
				return;
			}
			//없으면 없는 제품이라고 출력
			System.out.println("없는 제품!");
}
private void sell() {
	//제품명 입력
	System.out.print("제품명 : ");
	sc.nextLine();
	String name = sc.nextLine();
	//제품 개수 입력
	System.out.print("수량 : ");
	int amount = sc.nextInt();
	//고객 정보 입력
	System.out.print("번호 : ");
	String phoneNumber = sc.next();
	
	//있는 제품인지 확인
	int index = indexOf(name);
	if(index < 0) {
		System.out.println("제품명 오류");
		return;
	}
	if(amount <= 0) {
		System.out.println("제품 수량 오류!");
		return;
	}
	//있는 고객인지 확인
	int customerIndex = indexOfCustomer(phoneNumber);
	 if(customerIndex < 0) {
		 System.out.println("전화번호 오류!");
		 return;
	 }
	//판매 내역에 추가
	//제품 정보
	//복사 생성자를 이용해서 제품 정보를 복사(깊은 복사)
	Product product = new Product(list[index]);
	product.setAmount(amount);
	 //고객 정보
	 Customer customer = customerList[customerIndex];
	 
	Sales sales = new Sales(customer, product);
	salesHistory[salesCount++] = sales;
	
	//판매된 개수만큼 제고량에서 뺴줘야함.
	list[index].release(amount);
	//매출금액을 추가
	totalPrice += sales.getTotalPrice();	
}
private int indexOfCustomer(String phoneNumber) {
	for(int i = 0; i<customerCount ;i++) {
		//고객의 번호가 같으면
		if(customerList[i].getPhoneNumber().equals(phoneNumber)) {
			return i;
		}
	}
	return -1;
}

private void store() {
	//입고할 제품명 입력
	System.out.print("제품명 : ");
	sc.nextLine();
	String name = sc.next();
	sc.nextLine();
	//입고할 제품 수량
	System.out.print("수량  : ");
	int amount = sc.nextInt();
	
	if(amount<0) {
		System.out.println("입고 수량 오류!");
		return;
	}
	//제품 리스트에서 입고할 제품명이 있는지 찾음
	//제품 배열에 있는 제품명과 입고할 제품명이 같은지를
	//확인해서 같으면 위치를 기억
	int index = indexOf(name);
	//있으면 입고할 제품 수량 만큼 해당 제품에 입고
	//위치가 0 이상이면
	if(index != -1) {
		list[index].store(amount);
		System.out.println("입고 완료!");
		return;
	}
	
	//있으면 입고할 제품 수량 만큼 해당 제품에 입고
	//위치가 -1이면
	//없으면 제품 리스트에 제품 정보를 추가(입고할 수량도 함께)
	//최대치로 등록되어 있으면
	if(count == list.length) {
		System.out.println("제품 리스트 다참!");
		return;
	}
	//모델명 입력
	System.out.println("새 제품 등록");
	System.out.print("모델명 : ");
	sc.nextLine();
	String modelName = sc.nextLine();
	//가격을 입력
	System.out.print("가격 : ");
	int price = sc.nextInt();
	//분류 입력
	System.out.print("분류 : ");
	String category = sc.next();	
	//제품 리스트에 추가
	list[count++] = new Product(name, modelName, price, amount, category);
	System.out.println("제품 추가 후 입고 완료");
}
/** 제품 리스트에 제품명과 일치하는 제품이 있으면 번지를,없으면
 *  -1을 알려주는 메서드
 *  매개변수 :	제품명
 *  리턴타입 : 제품이 있는 번지나 -1 =>정수 => int 
 *  메서드명 : indexOf
 */

public int indexOf(String name) {
	for(int i = 0; i<count; i++) {
		if(list[i].getName().equals(name)) {
			return i;
		}
	}
	return -1;
 }
}
