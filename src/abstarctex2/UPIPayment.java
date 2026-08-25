package abstarctex2;

public class UPIPayment extends Payment {

	@Override
	void makePayment(double amount) {
		System.out.println("Paid Rs." +amount+ " Using UPI");
		
	}
	
	

}
