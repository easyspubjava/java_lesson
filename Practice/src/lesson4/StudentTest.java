package lesson4;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.setStudentName("ȫ�浿");
		System.out.println(studentLee.studentName + " �й�:"  
		                        + studentLee.studentID);
		
		Student studentSon = new Student();
		studentSon.setStudentName("�̼���");
		System.out.println(studentSon.studentName + " �й�:" 
		                        + studentSon.studentID);
	}
}

