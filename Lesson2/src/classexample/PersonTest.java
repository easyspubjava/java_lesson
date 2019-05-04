package classexample;

public class PersonTest {

	public static void main(String[] args) {

		Person personLee = new Person("ÀÌ¸ù·æ");
		
		personLee.height = 180;
		personLee.weight = 85;
		
		String name = personLee.getName();
		//personLee.setName("Lee");
		
		
		System.out.println(personLee.showPersonInfo());
		
		Person personKim = new Person("±èÀ¯½Å", 100, 188);
		
		
		System.out.println(personKim.showPersonInfo());
		
		System.out.println(personLee);
		System.out.println(personKim);
		
	}

}
