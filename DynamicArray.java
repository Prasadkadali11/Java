package durga.prasad;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter the No.of.Rows :");
		int n = read.nextInt();
		System.out.println("Enter The No.Of.Colunms :");
		int m = read.nextInt();
		System.out.println("Please Enter The Array Values");
		int i,j;
		int a[][] = new int[n][m];
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				a[i][j] = read.nextInt();

			}
		}
		System.out.println("2 Dimensional Array");
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}

		read.close();
	}

}
