package lesson2;

public class StudentTest {

	public static void main(String[] args) {

		Student studentDong = new Student();
		studentDong.studentName = "ȫ�浿";
		studentDong.studentId = 1001;
		studentDong.grade = 2;
		
		System.out.println("�й� : " + studentDong.studentId );
		System.out.println("�̸� : " + studentDong.studentName );
		System.out.println("�г� : " + studentDong.grade + "�г�");
	}

}
