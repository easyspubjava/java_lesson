package lesson4;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.setStudentName("홍길동");
		System.out.println(studentLee.studentName + " 학번:"  
		                        + studentLee.studentID);
		
		Student studentSon = new Student();
		studentSon.setStudentName("이순신");
		System.out.println(studentSon.studentName + " 학번:" 
		                        + studentSon.studentID);
	}
}

