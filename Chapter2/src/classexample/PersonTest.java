package classexample;

public class PersonTest {

	public static void main(String[] args) {

		Person personLee = new Person("�̸���");
		
		personLee.height = 180;
		personLee.weight = 85;
		
		String name = personLee.getName();
		//personLee.setName("Lee");
		
		
		System.out.println(personLee.showPersonInfo());
		
		Person personKim = new Person("������", 100, 188);
		
		
		System.out.println(personKim.showPersonInfo());
		
		System.out.println(personLee);
		System.out.println(personKim);
		
	}

}
