package lesson11;

public class MemberShipTest {

	public static void main(String[] args) {
		MemberShip memberLee = new MemberShip(1001, "�̼���");
		MemberShip memberLee2 = new MemberShip(1001, "�̼���");
		
		System.out.println(memberLee);
		System.out.println(memberLee2);
		
		if (memberLee.equals(memberLee2)) {
			System.out.println(memberLee.getMemberName() + "�� " + 
		               memberLee2.getMemberName() +"�� ������ �Դϴ�.");
		}
	}
}


