package durga.prasad;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		arr [0][0] = 1;
		arr [0][1] = 2;

		arr [1][0] = 1;
		arr [1][1] = 2;


		arr [2][0] = 1;
		arr [2][1] = 2;

		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");

			}
			System.out.println();
		}

		
		}

	}
