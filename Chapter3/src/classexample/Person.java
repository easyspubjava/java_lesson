package classexample;

public class Person {
	
	public int height;
	public int weight;
	private String name;
	
//	public Person() {}
	
	public Person(String pName) {
		name = pName;
	}
	
	public Person(String pName, int pWeight, int pHeight) {
		name = pName;
		weight = pWeight;
		height = pHeight;
	}
	
	public String showPersonInfo() {
		return "�̸��� "+ name + "�̰�, Ű��" + height + "�̰�, �����Դ� " + weight +"�Դϴ�";
	}

	public String getName() {
		return name;
	}

	
	
}
