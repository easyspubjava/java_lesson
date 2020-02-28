package lesson7;

import java.util.ArrayList;

public class MemberShipTest {

	public static void main(String[] args) {

		ArrayList<MemberShip> memberList = new ArrayList<MemberShip>();
		
		MemberShip customerLee = new MemberShip(10010, "�̼���");
		MemberShip customerShin = new GoldMemberShip(10020, "�Ż��Ӵ�");
		MemberShip customerHong = new VIPMemberShip(10030, "ȫ�浿", 5001);
		
		memberList.add(customerLee);
		memberList.add(customerShin);
		memberList.add(customerHong);
		
		
		System.out.println("====== �� ���� ��� =======");
		
		for( MemberShip customer : memberList){
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� =======");
		
		int price = 10000;
		for( MemberShip member : memberList){
			int cost = member.calcPrice(price);
			System.out.println(member.getMemberName() +" ���� " +  + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(member.getMemberName() +" ���� ���� ���ʽ� ����Ʈ�� " + member.bonusPoint + "���Դϴ�.");
		}
	
		
	}

}
