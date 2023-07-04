package day25.student.vo;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
	private int classNum;
	private String name,major;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return classNum == other.classNum;
	}
	@Override
	public int hashCode() {
		return Objects.hash(classNum);
	}
	@Override
	public String toString() {
		return "학번 : " +classNum+ "\n이름 : " + name+"\n전공 : "+major;
	}
	
	
}
