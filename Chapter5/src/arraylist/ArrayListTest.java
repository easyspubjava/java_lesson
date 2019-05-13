package arraylist;

import java.util.ArrayList;
import array.Book;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList<Book> library = new ArrayList<Book>();
		library.add(new Book("�¹���1", "������"));
		library.add(new Book("�¹���2", "������"));
		library.add(new Book("�¹���3", "������"));
		
		for(Book book:library) {
			book.showBookInfo();
		}
	}

}
