package lesson6;

public class VIPMemberShip extends MemberShip{

	public double salesRatio;
	public int agentId;     //���� ���� ���̵�
	
	public VIPMemberShip(int memberId, String memberName) {
		super(memberId, memberName);
		
		memberShip = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

}
