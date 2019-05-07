package inheritance;

public class MemberShipTest {

	public static void main(String[] args) {

		MemberShip silvermember = new MemberShip(1001, "Lee");
		MemberShip goldMember = new GoldMemberShip(1002, "Kim");
		
		
		int price = 10000;
		int memberPrice = silvermember.calcPrice(price);
		int goldMemberPrice = goldMember.calcPrice(price);
		
		System.out.println( silvermember.memberName+ "���� ����� " + silvermember.memberShip + "�̰� ���� ������ " + memberPrice + "�̸�, ���ʽ� ����Ʈ�� " + silvermember.bonusPoint + "�Դϴ�");
		System.out.println( goldMember.memberName+ "���� ����� " + goldMember.memberShip + "�̰� ���� ������ " + goldMemberPrice + "�̸�, ���ʽ� ����Ʈ�� " + goldMember.bonusPoint + "�Դϴ�");
	}
}
