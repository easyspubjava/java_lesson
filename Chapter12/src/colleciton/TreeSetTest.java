package colleciton;

import java.util.TreeSet;

public class TreeSetTest{

	public static void main(String[] args) {
		
		TreeSet<Student> set = new TreeSet<Student>();
		set.add(new Student("kim", 1001));
		set.add(new Student("Lee", 1005));
		set.add(new Student("Park", 1002));
		
		System.out.println(set);
	}
}
