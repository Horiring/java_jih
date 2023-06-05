package day5.switchex;

public class HelloWorldEx {

	public static void main(String[] args) {
		//hello world를 10번 출력하는 코드를 작성하세요.
		
		int i = 1;
		while(i<=10) {
			System.out.println("Hello World");
			 i++;
		}
		System.out.println("=========================");
		for(int j=1; j<=10;j++) {
			System.out.println("Hello World");
		}
		System.out.println("=========================");
		i = 5;
		while(i>=1) {
			System.out.println("Hello World");
			 i--;
			
		}
		System.out.println("=========================");
		while(i-->0) {
			System.out.println("Hello World");
			
		}
	}

}
