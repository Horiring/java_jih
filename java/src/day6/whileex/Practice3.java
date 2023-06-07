package day6.whileex;

public class Practice3 {

	public static void main(String[] args) {
		int a = 6;
		int result = 0;
		for(int i =1; ;i++) {
			if(a<i) {
			break;
			}
			result = a * i;
			System.out.println(""+a+"x"+i+"="+result);
		}
	}

}
