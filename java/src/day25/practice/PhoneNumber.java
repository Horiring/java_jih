package day25.practice;

class PhoneNumber{
	private String name, number;
	public PhoneNumber() {}
	
	public PhoneNumber(String name, String number) {
		this.name = name;
		this.number = number;
	}
	//toString 메서드는 Object 클래스에게서 상속을 받음
	/*
	 * public String toString(){
	 * return xxx;
	 * }
	 */
	@Override
	//오버라이드 하려면 메서드 선언부가 같아야함. 그런데 매게변수가 다름
	//@Override을 제거 =>	메서드 오버로딩이 되기 떄문에
	//매개변수를 제거
	public String toString(){
		return "이름 : " + name + ",번호 : " + number;
	}
}