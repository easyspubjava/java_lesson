package lesson10;

public class LibraryTest {

	public static void main(String[] args) {

		Stack stackLibaray = new MyLibrary();
		stackLibaray.push("���� 1");
		stackLibaray.push("���� 2");
		stackLibaray.push("���� 3");
		
		System.out.println("=============");
		
		stackLibaray.pop(); 
		stackLibaray.pop();
		stackLibaray.pop();
		
	}
}
