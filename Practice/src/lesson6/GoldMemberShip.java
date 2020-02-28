package lesson6;

public class GoldMemberShip extends MemberShip{

	public double salesRatio;
	
	public GoldMemberShip(int memberId, String memberName) {
		super(memberId, memberName);

		memberShip = "GOLD";
		bonusRatio = 0.05;
		salesRatio = 0.05;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= price * salesRatio;
		return price;
	}
}
