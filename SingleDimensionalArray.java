package durga.prasad;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		/*
		 * int[] i = new int[5]; i[0] = 5; i[1] = 6; i[2] = 4; i[3] = 9; i[4] = 5;
		 */
		int[] i = {5,6,7,8,4};
		
		System.out.println(i[4]);
		System.out.println(i[2]);
		
		for (int j = 0; j<i.length;j++ ) {
			System.out.println(i[j]);
		}
	
	}

}
