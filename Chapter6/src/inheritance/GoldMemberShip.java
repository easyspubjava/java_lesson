package inheritance;

public class GoldMemberShip extends MemberShip{

	private double salesRatio;
	
	public GoldMemberShip(int memberId, String memberName) {
		super(memberId, memberName);
		
		memberShip = "GOLD";
		bonusRatio = 0.05;
		salesRatio = 0.05;
	}
	
	public int calcPrice(int price) {
		bonusPoint  += price * bonusRatio;
		price -= price * salesRatio;
		return price;
	}

	
}
