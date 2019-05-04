package classexample;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		
		if ( month == 2 ) {
			if(day > 28) {
				System.out.println("날짜 오류입니다");
				//isValid = false;
				return;
			}
		}
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
