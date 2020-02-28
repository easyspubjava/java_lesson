package lesson7;

public class VIPMemberShip extends MemberShip{

	public double salesRatio;
	public int agentId;     //���� ���� ���̵�
	
	public VIPMemberShip(int memberId, String memberName, int agentId) {
		super(memberId, memberName);
		
		memberShip = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		this.agentId = agentId;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= price * salesRatio;
		return price;
	}
		
	public String showCustomerInfo(){
		return super.showCustomerInfo() + " ��� ���� ��ȣ�� " + agentId + "�Դϴ�";  
	}

}
