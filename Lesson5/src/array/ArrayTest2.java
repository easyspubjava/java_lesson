package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		int[] number = new int[] {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
					
		for(int i=0; i<number.length; i++){
			total += number[i];
		}
		
		System.out.println("1���� 10������ ���� " + total + "�Դϴ�");
	}
}
