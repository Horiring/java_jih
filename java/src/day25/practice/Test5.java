package day25.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test5 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		//Collection 인터페이스에 있는 메서드 : add,size
		//Collection 인터페이스의 자식으로 List와 Set
		set.add(1);
		set.add(2);
		Iterator<Integer> iterSet = set.iterator();
		for(int i = 0; i<set.size(); i++) {
			System.out.println(iterSet.next());
		}
		
		//set의 경우 iterator or 향상된 for문 이용
		for(Integer tmp : set) {
			System.out.println(tmp);
		}
	}
}
