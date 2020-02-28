package lesson6;

public class VIPMemberShip extends MemberShip{

	public double salesRatio;
	public int agentId;     //전문 상담원 아이디
	
	public VIPMemberShip(int memberId, String memberName) {
		super(memberId, memberName);
		
		memberShip = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

}
