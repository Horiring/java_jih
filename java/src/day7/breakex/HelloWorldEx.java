package day7.breakex;

public class HelloWorldEx {

	public static void main(String[] args) {
		for(int i =1; i<=10;i++) {
			System.out.println("HelloWorld");
			if(i==5)
			break;
		}
		int i = 1;
		while(true) {
			System.out.println("HelloWorld");
			if(i==5) {
				break;
			}
			i++;
		}

	}

}
