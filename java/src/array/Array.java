package array;

public class Array {

	//배열 전체 출력
	public static void printArray(int arr[]) {
		System.out.print("[");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+(i==arr.length-1?"":", "));
		}
		System.out.println("]");
	}
	//배열을 start 번지부터 end-1번지까지 출력
	public static void printArray(int arr[],int start,int end ) {
		System.out.print("[");
		for(int i = start; i<end; i++) {
			if(i >= arr.length) {
				break;
			}
			System.out.print(arr[i]+(i==end-1?"":", "));
		}
		System.out.println("]");
	}
	
	//num가 배열의 원소 중에서 0번지부터 count개 안에 있는지 확인하는 메서드
	public static boolean contains(int arr[], int num, int count) {
		for (int i = 0; i < count; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		return false;
	}
	
	//
	public static int[] createRandomArray(int min, int max, int arr[]) {
		//max가 min보다 작으면 두 수를 교환
		if(max<min) {
			int tmp = max;
			max = min;
			min = max;
		}
		if(arr== null) {
			arr=new int[max-min+1];
		}
		int random = (int) (Math.random() * (max - min + 1) + min);
		if(max -min +1<arr.length) {
			return null;
		}
			int count = 0;
			while (count < arr.length) {
				random = (int) (Math.random() * (max - min + 1) + min);
				if(!contains(arr,random,count)) {
					arr[count]=random;
					count++;
				}
			}
			return arr; 
	}
	/**	주어진 배열에 중복된 값이 있는지 없는지 알려주는 메서드
	 * 	매개변수 : 배열=>int arr[]
	 * 	리턴타입 :	중복여부 => boolean
	 * 	메서드명 : arrayCheck
	 */
	public static boolean arrayCheck(int arr[]) {
		if(arr==null) {
			return false;
		}
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					continue;
				}
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
}

