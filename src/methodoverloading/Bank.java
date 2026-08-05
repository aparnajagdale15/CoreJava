package methodoverloading;

public class Bank {
	
	void deposit(double amount) {
		 System.out.println("Cash Amount: " + amount);
    }

    void deposit(double amount, int accountNo) {
        System.out.println("Cash Amount: " + amount);
        System.out.println("Account Number: " + accountNo);
    }

    void deposit(double amount, int accountNo, String name) {
        System.out.println("Cash Amount: " + amount);
        System.out.println("Account Number: " + accountNo);
        System.out.println("Depositor Name: " + name);
    }
	

	public static void main(String[] args) {
		
		Bank b1=new Bank();
		b1.deposit(82.500);
		
		System.out.println();
		
		b1.deposit(45.345, 1234567654);
		
		System.out.println();
		
		b1.deposit(23.123, 1234505, "Shubham");
		
	}

}
