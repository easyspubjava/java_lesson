package inheritance;

public class MemberShipTest {

	public static void main(String[] args) {

		MemberShip member = new MemberShip(1001, "Lee");
		MemberShip goldMember = new GoldMemberShip(1002, "Kim");
		
		
		int price = 10000;
		int memberPrice = member.calcPrice(price);
		int goldMemberPrice = goldMember.calcPrice(price);
		
		System.out.println( member.memberName+ "���� ����� " + member.memberShip + "�̰� ���� ������ " + memberPrice + "�̸�, ���ʽ� ����Ʈ�� " + member.bonusPoint + "�Դϴ�");
		System.out.println( goldMember.memberName+ "���� ����� " + goldMember.memberShip + "�̰� ���� ������ " + goldMemberPrice + "�̸�, ���ʽ� ����Ʈ�� " + goldMember.bonusPoint + "�Դϴ�");
	}
}
