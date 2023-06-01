package day2.variable;

public class OverflowEx {

	public static void main(String[] args) {
		//오버플로우
		byte num = 127;
		++num;
		System.out.println(num);
		//언더플로우
		num = -128;
		--num;
		System.out.println(num);
	
	}

}
