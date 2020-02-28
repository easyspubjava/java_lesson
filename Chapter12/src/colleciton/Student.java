package colleciton;

public class Student implements Comparable<Student>{

	String studentName;
	int studentId;
	
	public Student(String studentName, int studentId) {
		this.studentName = studentName;
		this.studentId = studentId;
	}
	
	public String toString() {
		return studentName + "," + studentId;
	}

	@Override
	public int compareTo(Student student) {
		
		return (studentId - student.studentId) * -1;
	}
}
