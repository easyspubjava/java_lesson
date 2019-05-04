package thisex;

public class Person {

	String name;
	int weight;
	int height;
	
	public Person() {
		this("이름 없음");
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person callThis() {
		return this;
	}
	
	public void showInfo() {
		System.out.println(name);
	}
}
