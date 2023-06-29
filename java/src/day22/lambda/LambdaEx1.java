package day22.lambda;

public class LambdaEx1 {

	public static void main(String[] args) {
		InterfaceA a = new InterfaceA() {
			
			@Override
			public int getMax(int num1, int num2) {
				return num1 >= num2 ? num1 : num2;
			}
		};
		System.out.println(a.getMax(10, 20));
		
		InterfaceA b = (num1,num2)->{
			return num1 >= num2 ? num1 : num2;
		};
		System.out.println(b.getMax(10, 20));
		//실행문이 한줄이면 람다식 간소화
		InterfaceA c = (num1,num2)->num1 >= num2 ? num1 : num2;
		
		System.out.println(c.getMax(10, 20));
		};
		
}


interface InterfaceA{
	int getMax(int num1, int num2);
}