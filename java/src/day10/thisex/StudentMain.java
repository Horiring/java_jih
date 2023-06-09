package day10.thisex;

public class StudentMain {

	public static void main(String[] args) {
		Student1.printCount();
		Student1 std1 = new Student1(1,1,1,"홍길동");
		Student1.printCount();
		Student1 std2 = new Student1(1,1,2,"임꺽정");
		Student1.printCount();
		
		//std2.studentCount=1;
		//System.out.println(std1.studentCount);
		std1.print();
		//Student1.print(); 에러발생 static이 print에는 안붙어서 
		std2.print();
	}
}

class Student1{
	private static int studentCount;
	
	private int grade, classNum, number;
	private String name;
	//아래 생성자는 매개변수가 있고, 매개변수의 이름이 멤버변수와 같기 떄문에
	//멤버 변수를 호출할 때 this를 반드시 붙여야함.
	public Student1(int grade, int classNum, int number, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.number = number;
		this.name = name;
		studentCount++;
	}
	//기본 생성자는 매게변수가 없기 떄문에 this를 안써도됨.
	public Student1() {
		//멤버 변수와 이름이 같은 지역변수를 만들수도 있다.(비추천)
		//int grade = 1;
		//name = ""; this 앞에
		this(1,1,1,"");
		/*
		this.grade = grade;
		classNum =1;
		number =1;
		name = "";
		*/
	}
	
	public void print() {
		System.out.println("==========");
		System.out.println("grade   : "+ grade);
		System.out.println("classNum   : "+ classNum);
		System.out.println("number   : "+ number);
		System.out.println("name   : "+ name);
		//클래스 변수 사용 가능
		System.out.println("count    : "+studentCount);
		//클래서 메서드 사용가능
		printCount();
		}
	public static void printCount() {
		//클래스 변수 사용 가능
		System.out.println("Registered student count : "+ studentCount);
		//객체 변수 사용불가능
		//grade = 1;
		//객체 메서드 사용 불가능
		//print();
		//객체를 생성 후 호출해서 사용가능
		//Student1 std1 = new Student1();
		//std1.name = "홍길동";
		//std1.print();
	}
	
}