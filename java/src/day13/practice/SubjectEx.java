package day13.practice;

import lombok.Data;


@Data
public class SubjectEx {

	public static void main(String[] args) {
		// 성적을 관리하기위한 클래스를 만드세
		Subject sub1 = new Subject("국어");
		sub1.print();
		System.out.println("==============");
		Subject sub2 = new Subject("영어",2,2);
		sub2.updateScore(30, 40, 10);
		sub2.print();
		
	}

}