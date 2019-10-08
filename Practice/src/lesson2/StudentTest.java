package lesson2;

public class StudentTest {

	public static void main(String[] args) {

		Student studentDong = new Student();
		studentDong.studentName = "홍길동";
		studentDong.studentId = 1001;
		studentDong.grade = 2;
		
		System.out.println("학번 : " + studentDong.studentId );
		System.out.println("이름 : " + studentDong.studentName );
		System.out.println("학년 : " + studentDong.grade + "학년");
	}

}
