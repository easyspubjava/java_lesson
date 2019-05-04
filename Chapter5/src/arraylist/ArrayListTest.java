package arraylist;

import java.util.ArrayList;

import array.Book;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<Book>();

		
		library.add( new Book("�¹���", "������") );
		library.add( new Book("���̾�", "��ֿ���") );
		library.add( new Book("��� �� ���ΰ�", "���ù�") );
		library.add( new Book("����", "�ڰ渮") );
		library.add( new Book("�����", "�������丮") );
		
		for(int i=0; i<library.size(); i++){
	
			Book book = library.get(i);
			book.showBookInfo();
		}
		
		System.out.println();
		System.out.println("for-each ���");
		for(Book book : library){
			book.showBookInfo();
		}
	}
}