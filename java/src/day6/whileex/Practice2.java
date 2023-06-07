package day6.whileex;

public class Practice2 {
	
	public static void main(String[] args) {
		int a = 2;
		int result = 0;
		for(int i =1;i<=9;i++) {
			if(i % 2 !=0) {
			continue;
			}
			result = a * i;
			System.out.println(""+a+"x"+i+"="+result);
		}
	}
	
}
