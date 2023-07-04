package day25;

import java.util.Arrays;

public class TestEX {

	public static void main(String[] args) {
		int[] arr = {5,4,3,2,6};
		int[] result= new int[arr.length];
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			result[i] += arr[i];
			}
		}
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
	}
}
