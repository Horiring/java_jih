package day22.homework.manager.student.run;

import day22.homework.manager.student.controller.StudentManager;

public class Run {
	/*고등학생을 관리하는 프로그램을 작성하세요.
	학생 관리(입학, 전학(오는 학생, 가는 학생),졸업, 진학)
	성적 관리
	면담
	 */
	public static void main(String[] args) {
		StudentManager student = new StudentManager();
		student.run();
	}

}
