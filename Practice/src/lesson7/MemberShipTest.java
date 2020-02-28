package lesson7;

import java.util.ArrayList;

public class MemberShipTest {

	public static void main(String[] args) {

		ArrayList<MemberShip> memberList = new ArrayList<MemberShip>();
		
		MemberShip customerLee = new MemberShip(10010, "이순신");
		MemberShip customerShin = new GoldMemberShip(10020, "신사임당");
		MemberShip customerHong = new VIPMemberShip(10030, "홍길동", 5001);
		
		memberList.add(customerLee);
		memberList.add(customerShin);
		memberList.add(customerHong);
		
		
		System.out.println("====== 고객 정보 출력 =======");
		
		for( MemberShip customer : memberList){
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== 할인율과 보너스 포인트 계산 =======");
		
		int price = 10000;
		for( MemberShip member : memberList){
			int cost = member.calcPrice(price);
			System.out.println(member.getMemberName() +" 님이 " +  + cost + "원 지불하셨습니다.");
			System.out.println(member.getMemberName() +" 님의 현재 보너스 포인트는 " + member.bonusPoint + "점입니다.");
		}
	
		
	}

}
