package staticex;

public class Card {

	private static int serialNum = 1000;
	int cardNumber;
	
	public Card() {
		serialNum++;
		cardNumber = serialNum;
	}

	public static int getSerialNum() {
		
		
		int i = 0;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Card.serialNum = serialNum;
	}
	
	
}
