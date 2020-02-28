package lesson3;

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date = new MyDate(10, 12, 2019);
		System.out.println( date.getYear() + "년 " + date.getMonth() + "월 " + date.getDay() + "일 입니다.");
	}

}
