package classexample;

public class PersonTest {

	public static void main(String[] args) {

		Person personLee = new Person();
		
		personLee.height = 180;
		personLee.weight = 85;
		personLee.name = "�̸���";
		
		System.out.println(personLee.showPersonInfo());
		
		Person personKim = new Person();
		personKim.height = 180;
		personKim.weight = 85;
		personKim.name = "������";
		
		System.out.println(personKim.showPersonInfo());
		
		System.out.println(personLee);
		System.out.println(personKim);
		
	}

}
