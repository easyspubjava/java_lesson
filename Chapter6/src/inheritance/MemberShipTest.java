package inheritance;

public class MemberShipTest {

	public static void main(String[] args) {

		MemberShip memberLee = new MemberShip(1002, "Lee");
		GoldMemberShip memberKim = new GoldMemberShip(1001, "Kim");
		
		MemberShip memberPark = new GoldMemberShip(1003,  "Park");
		
		int price = 10000;
		int memberPrice = memberLee.calcPrice(price);
		System.out.println(memberPrice);
		int goldPrice = memberKim.calcPrice(price);
		System.out.println(goldPrice);
		int parkPrice = memberPark.calcPrice(price);
		System.out.println(parkPrice);
		
		
		/*System.out.println(memberPark.memberShip);
		
		if( memberPark instanceof GoldMemberShip) {
		
			GoldMemberShip gMember = (GoldMemberShip)memberPark;
			System.out.println(gMember.salesRatio);
		}*/
		
	}

}
