package abstarctex2;

public class CreditCardPayment extends Payment {

	@Override
	void makePayment(double amount) {
		
		System.out.println("Paid Rs." +amount+ " Using Credit Card");
		
	}

}
