package day25;

import java.util.Arrays;

public class Sort{

    public static void main(String[] args) {
    	Solution st = new Solution();
    	int arr[] = {5,3,6,8,1};
    	st.solution(arr, 2);
    	System.out.println(st);
    	}
}

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        for(int i = 0; i<arr.length;i++){
            if(arr[i]%divisor==0){
                answer[i]+= arr[i];
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
