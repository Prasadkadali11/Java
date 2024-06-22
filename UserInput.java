package durga.prasad;

import java.util.Iterator;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your name?");
		String name = scanner.nextLine();
		System.out.printf("hey %s, How are You?\n", name);
		String status = scanner.nextLine();
		System.out.println("what is your age?");
		int age = scanner.nextInt();
		System.out.println("thank you for the inforamatin");
		scanner.close();
			
	}

}
