package lesson6;

public class MemberShipTest {

	public static void main(String[] args) {

		MemberShip memberLee = new MemberShip(1001, "Lee");
		MemberShip memberKim = new GoldMemberShip(1002, "Kim");
		MemberShip memberPark = new VIPMemberShip(1003,  "Park");
		
		memberLee.showMemberShipInfo();
		memberKim.showMemberShipInfo();
		memberPark.showMemberShipInfo();
	}

}
