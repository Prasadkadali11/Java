package durga.prasad;

import java.util.Scanner;

public class ArrayTwoDimensional {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("please enter array values");
		int [][] a= new int [5][3]; //array declaration
		int i;
		int j;
		for(i=0;i<5;i++) {
			for (j=0;j<3;j++) {
				a[i][j]=read.nextInt();
			}
		}
		System.out.println("x:Array elemnts");
		for(i=0;i<5;i++) {
			for (j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			read.close();

		}
	}
	
}

