package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};

		int total = 0;
		for(int num : numbers) {
			total += num;
		}
		
		System.out.println(total);
	
	}

}
