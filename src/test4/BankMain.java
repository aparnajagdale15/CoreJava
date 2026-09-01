package test4;

public class BankMain {

	public static void main(String[] args) {
		BankAccount a=new BankAccount();
		a.setAccountHolderName("Aparna");
        a.setAccountNumber(1234567876);
        a.setBalance(50000.456);
        
        
        a.displayAccountInfo();
        
        
        
	}

}
