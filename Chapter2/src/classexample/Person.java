package classexample;

public class Person {
	
	int height;
	int weight;
	String name;
	
	public String showPersonInfo() {
		return "이름은 "+ name + "이고, 키는" + height + "이고, 몸무게는 " + weight +"입니다";
	}
}
