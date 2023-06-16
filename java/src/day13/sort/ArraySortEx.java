package day13.sort;

import java.util.Arrays;
import java.util.Comparator;

import array.Array;

public class ArraySortEx {

	public static void main(String[] args) {
		int arr[] = {1,4,7,9,2,8,3,6};
		
		for(int i = 0; i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			Array.printArray(arr);
		}
		Integer arr2[] = {1,4,7,9,2,8,3,6};
		//Arrays.sort(arr2); //오름차순
		Arrays.sort(arr2,Comparator.reverseOrder());//내림차순
		for(int tmp:arr2) {
			System.out.print(tmp+" ");
		}
	}

}
