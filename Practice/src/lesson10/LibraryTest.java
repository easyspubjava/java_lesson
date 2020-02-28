package lesson10;

public class LibraryTest {

	public static void main(String[] args) {

		Stack stackLibaray = new MyLibrary();
		stackLibaray.push("토지 1");
		stackLibaray.push("토지 2");
		stackLibaray.push("토지 3");
		
		System.out.println("=============");
		
		stackLibaray.pop(); 
		stackLibaray.pop();
		stackLibaray.pop();
		
	}
}
