package lesson10;

import java.util.ArrayList;

public class Library {

	protected ArrayList<String> shelf;
	
	public Library(){
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount(){
		return shelf.size();
	}
}
