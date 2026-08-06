package Test3Hi;

public class Main {

	public static void main(String[] args) {
		
		SavingsAccount s = new SavingsAccount();
		s.accountDetails();
		s.calculateInterest();
		
		System.out.println();
		
		CurrentAccount c = new CurrentAccount();
		c.accountDetails();
		c.displayMinimumBalance();
		

	}

}
