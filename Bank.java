package durga.prasad;

public class Bank {
	// this is used for denothing the current balance in bank account
   static int currentBalance = 1000;
  
	public static void greetCustmer() {
	System.out.println("hello,welcome to the banking application");
	}
	
	public void deposit(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("amount is deposited successfully");
		
	}
	public static void withdrwal (int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("amount is withdral successfully");
		
	}
	public int getCurrentBalance() {
		return currentBalance;
	
		
	}
	public static void main(String[] args) {
		Bank bank = new Bank();
		greetCustmer();
		
		System.out.println("current balance is : "+bank.getCurrentBalance());
		bank.deposit(500);
		
        System.out.println("current balance is : "+bank.getCurrentBalance());
        withdrwal(300);
        System.out.println("current balance is : "+bank.getCurrentBalance());
	}
}
