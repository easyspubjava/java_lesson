package lesson12;

public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance( );
		
		Car hongCar1 = factory.createCar("홍길동차");
		Car hongCar2 = factory.createCar("홍길동차");
		System.out.println(hongCar1 == hongCar2); 
	
		Car leeCar1 = factory.createCar("이순신차");
		Car leeCar2 = factory.createCar("이순신차");
		System.out.println(leeCar1 == leeCar2); 
		System.out.println(hongCar1 == leeCar1); 
	}
}


