package inheritance;

public class MemberShip {

	private int memberId;
	protected String memberName;
	protected int bonusPoint;
	protected double bonusRatio;
	protected String memberShip;
	
	/*public MemberShip(){
		memberShip = "SILVER";
		
		System.out.println("Member Ŭ���� ����");
	}*/
	
	public MemberShip(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
		memberShip = "SILVER";
		bonusRatio = 0.01;
		
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
		
	}
}
