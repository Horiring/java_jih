package day22.lambda;

import java.util.function.Consumer;

import day22.lambda.Student;
import lombok.AllArgsConstructor;
import lombok.Data;

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		Consumer<String> consumer = (s) ->{
			System.out.println(s);
		};
		//Consumer<String> consumer = s ->System.out.println(s);
		consumer.accept("홍길동");
		Consumer<Student> consumer2 = s -> System.out.println(s.getName());
		Student std = new Student(1,1,1,"홍");
		consumer2.accept(std);
		
		
		printStudent(std);
		printStudent(std,s->System.out.println(s));
		
		printStudentName(std);
		printStudent(std,s->System.out.println(s.getName()));
		
		printStudent(std,s->{
			System.out.println("grade : "+s.getGrade());
			System.out.println("class : "+s.getClassNum());
			System.out.println("number : "+s.getNum());
		});
	}
	//학생 전체 정보 출력
	public static void printStudent(Student std) {
		System.out.println(std);
	}
	//학생 이름 출력
	public static void printStudentName(Student std) {
		System.out.println(std.getName());
	}
	public static void printStudent(Student std, Consumer<Student>consumer) {
		consumer.accept(std);
	}
	
}
@Data
@AllArgsConstructor
class Student{
	int grade, classNum , num;
	String name;
}
