package inheritance;

public class MemberShipTest {

	public static void main(String[] args) {

		MemberShip silvermember = new MemberShip(1001, "Lee");
		MemberShip goldMember = new GoldMemberShip(1002, "Kim");
		
		
		int price = 10000;
		int memberPrice = silvermember.calcPrice(price);
		int goldMemberPrice = goldMember.calcPrice(price);
		
		System.out.println( silvermember.memberName+ "님의 등급은 " + silvermember.memberShip + "이고 지불 가격은 " + memberPrice + "이며, 보너스 포인트는 " + silvermember.bonusPoint + "입니다");
		System.out.println( goldMember.memberName+ "님의 등급은 " + goldMember.memberShip + "이고 지불 가격은 " + goldMemberPrice + "이며, 보너스 포인트는 " + goldMember.bonusPoint + "입니다");
	}
}
