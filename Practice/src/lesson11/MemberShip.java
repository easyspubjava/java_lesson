package lesson11;

public class MemberShip {

	private int memberId;
	private String memberName;
	
	public MemberShip(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + "님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MemberShip) {
			MemberShip member = (MemberShip)obj;
			return this.memberId == member.memberId;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return memberId;
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
	}
	
	
}
