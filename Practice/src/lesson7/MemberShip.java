package lesson7;

public class MemberShip {

	protected int memberId;
	protected String memberName;
	protected int bonusPoint;
	protected double bonusRatio;
	protected String memberShip;
	
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
	
	public String showCustomerInfo(){
		return memberName + " 님의 등급은 " + memberShip + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";  
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	public String getMemberShip() {
		return memberShip;
	}

	public void setMemberShip(String memberShip) {
		this.memberShip = memberShip;
	}
	
	
}
