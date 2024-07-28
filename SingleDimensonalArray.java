package numbersprogramming;

import java.util.Scanner;

public class SingleDimensonalArray {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("please enter array length");
		int size = read.nextInt();
		int num = 0;
		int array [] = new int[size];
		System.out.println("please enter array values");
		for(int i = 0; i<size; i ++) {
			array[i] = read.nextInt();
			num = num+array[i];
		}
		double sum = num;
		System.out.println("sum is : "+num);
		System.out.println(" avarage "+(sum/size));
		

	}

}
