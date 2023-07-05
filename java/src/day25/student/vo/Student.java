package day25.student.vo;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Serializable{

	private static final long serialVersionUID = -4278406918013469014L;
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
