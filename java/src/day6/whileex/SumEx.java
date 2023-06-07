package day6.whileex;


public class SumEx {
	
	public static void main(String[] args) {
		//1부터 n까지 합을 구하는 코드를 작성하세요.(n은 10)
		
		int n  =10, sum = 0;
		int i =1;
		while(i<= n) {
			sum += i;
			i++;
		}
		System.out.println("1~"+n+" sum : "+ sum);
		

	}

}
