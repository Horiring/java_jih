package day25.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		//HashSet은 List의 구현 클래스가 아니기 떄문에 HashSet의 객체를 List가 관리할 수 없다 
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>(list);
		//3은 int 3이 자동으로 박싱되서 Integer의 객체로 저장
		list.add(3);
		list.add((int)4);
		//5를 박싱으로 Integer의 객체로 변환 후 저장
		list.add((Integer)5);

	}

}
