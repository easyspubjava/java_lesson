package lesson12;

public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance( );
		
		Car hongCar1 = factory.createCar("ȫ�浿��");
		Car hongCar2 = factory.createCar("ȫ�浿��");
		System.out.println(hongCar1 == hongCar2); 
	
		Car leeCar1 = factory.createCar("�̼�����");
		Car leeCar2 = factory.createCar("�̼�����");
		System.out.println(leeCar1 == leeCar2); 
		System.out.println(hongCar1 == leeCar1); 
	}
}


