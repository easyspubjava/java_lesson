package thisex;

public class PesonTest {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.showInfo();
		
		Person p2 = new Person("ȫ�浿");
		p2.showInfo();
		
		System.out.println(p2);
		System.out.println(p2.callThis());
	}
}
