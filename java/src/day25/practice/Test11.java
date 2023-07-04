package day25.practice;

public class Test11 {

	public static void main(String[] args) {
		TestProgram tp = new TestProgram();
		tp.print();
	}

}
interface Program{
	void run();
}
class TestProgram implements Program{
	
	int num;
	
	void print() {
		System.out.println(num);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}