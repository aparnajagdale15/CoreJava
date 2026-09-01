package test4;

public class BankAccount {
	    private String accountHolderName;
	    private long accountNumber;
	    private double balance;
	    
	    // Setter for accountHolderName
	    public void setAccountHolderName(String accountHolderName) {
	        this.accountHolderName = accountHolderName;
	    }

	    // Getter for accountHolderName
	    public String getAccountHolderName() {
	        return accountHolderName;
	    }

	    // Setter for accountNumber
	    public void setAccountNumber(long accountNumber) {
	        this.accountNumber = accountNumber;
	    }

	    // Getter for accountNumber
	    public long getAccountNumber() {
	        return accountNumber;
	    }

	    // Setter for balance
	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    // Getter for balance
	    public double getBalance() {
	        return balance;
	    }

	    // Method to display account information
	    public void displayAccountInfo() {
	        System.out.println("Account Holder Name: " + accountHolderName);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: " + balance);
	    }

}
