package inheritance;

import java.util.ArrayList;

public class MemberShipTest {

	public static void main(String[] args) {

		ArrayList<MemberShip> memberList = new ArrayList<MemberShip>();
		
		MemberShip silvermember = new MemberShip(1001, "Lee");
		MemberShip goldMember = new GoldMemberShip(1002, "Kim");
		
		memberList.add(silvermember);
		memberList.add(goldMember);
		
		int price = 10000;
		
		for(MemberShip member :memberList) {
			int newprice = member.calcPrice(price);
			System.out.println( member.memberName+ "���� ����� " + member.memberShip + "�̰� ���� ������ " + newprice + "�̸�, ���ʽ� ����Ʈ�� " + member.bonusPoint + "�Դϴ�");
		}
	}
}
