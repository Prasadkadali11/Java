package durga.prasad;

import java.util.Scanner;

public class ControalStatements {


	//positive number and negative number finding
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter any number");
		int i = scanner.nextInt();
		
		if (i<0) { System.out.println("the given number is a negative number");

		}
		else { System.out.println("the given nuber is a postive number");

		}scanner.close();
	}

}
