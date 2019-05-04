package staticex;

public class CardTest {

	public static void main(String[] args) {

		Card cardRed = new Card();
		System.out.println(cardRed.getCardNumber());
		
		Card cardblue = new Card();
		System.out.println(cardblue.getCardNumber());
		
		System.out.println(Card.getSerialNum());
		
	}

}
