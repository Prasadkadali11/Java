package durga.prasad;

public class OperatorsPratices {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;

		// * Arithmetic Operators *
		System.out.println(i+j);// +(addition)
		System.out.println(i-j);// -(subtraction)
		System.out.println(i*j);// *(multiplication)
		System.out.println(i/j);// /(division)
		System.out.println(i%j);// %(modulus)

		//* Unary Operators *
		//	incrementation
		System.out.println(i); //10
		System.out.println(++i); //11
		System.out.println(i++);  //11
		System.out.println(i); //12

		// Decrementation
		System.out.println(i); //12
		System.out.println(--i); //11
		System.out.println(i--);  //11
		System.out.println(i); //10

		// * Relational Operators *
		System.out.println(i==j); // == (equal to)
		System.out.println(i!=j); // != (not equal to)
		System.out.println(i<j);  // < (less than)
		System.out.println(i>j);  // > (greater than)
		System.out.println(i<=j); // <= (less than Or equal to)
		System.out.println(i>=j); // >= (greater than or equal to)
		
		// * conditional Operators *
		System.out.println(i<j || i==j); // true
		System.out.println(i<j && i==j); // false
		
		
		
	}

}
