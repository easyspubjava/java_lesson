package array;

public class TowDimension {

	public static void main(String[] args) {

		int[][] gugu = new int[8][9];
		
		int[][] arr = {{1,2},{4,5}};
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}

}
