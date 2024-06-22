package durga.prasad;

public class ConditionStatements2 {

	// * Switch Case condition
	public static void main(String[] args) {
		int i = 6;
		switch(i) {
		case 1:
			System.out.println("this is the first statement");
			break;
		case 2:
			System.out.println("this is the second statement");
			break;
		case 3:
			System.out.println("this is the third statement");
			break;

		default:
			System.err.println("the input is invalid");
			break;
		}

	}

}
