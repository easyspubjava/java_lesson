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
			System.out.println( member.memberName+ "님의 등급은 " + member.memberShip + "이고 지불 가격은 " + newprice + "이며, 보너스 포인트는 " + member.bonusPoint + "입니다");
		}
	}
}
