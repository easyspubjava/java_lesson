package lesson10;

public class MyLibrary extends Library implements Stack{

	@Override
	public void push(String title) {
		shelf.add(title);
		System.out.println(title + " ¹Ý³³");
	}

	@Override
	public String pop() {
		String title = shelf.remove(shelf.size()-1);
		System.out.println(title + " ´ë¿©");
		return title;
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
