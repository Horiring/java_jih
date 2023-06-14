package day11.practice;

public class DivisorEx {

	public static void main(String[] args) {
		//정수 num의 약수들을 배열에 저장하는 코드를 작성하세요.
		//약수는 최대 10개까지 저장
		int count=0;
		int a = 12;
		int arr[] = new int[10];
		for(int i = 1; i<=a ;i++) {
			if(a%i==0) {
				arr[count]=i;
				count++;
			}
			if(count==arr.length) {
				break;
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}

}
