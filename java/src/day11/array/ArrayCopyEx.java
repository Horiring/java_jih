package day11.array;

public class ArrayCopyEx {

	public static void main(String[] args) {
		//배열은 arr1과 arr2는 참조변수 주소를저장
		int arr1[] = new int[] {1,2,3,4,5};
		int arr2[] = arr1;
		
		arr2[0]=10;
		
		for(int tmp:arr1)
		System.out.println(tmp);
		
		arr2[0]=1; //초기값으로 되돌림
		arr2 = new int[arr1.length];//복사하기 위한 배열을 생성
		for(int i = 0; i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("===========");
		arr2[0] = 10; //반복문을 통해 복사된 arr2에 0번지를 수정해도 arr1은 안변함
		for(int tmp:arr1)
			System.out.println(tmp);
			
		int arr3[] = new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);

		System.out.println("===========");
		arr3[0] = 10; 
		for(int tmp:arr3)
			System.out.println(tmp);
	}

}
