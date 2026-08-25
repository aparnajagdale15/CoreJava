package abstarctex2;

public class MainMethod {

	public static void main(String[] args) {
		 
		Payment c1=new CreditCardPayment();
		c1.makePayment(205.5);
		
		Payment g1=new UPIPayment();
		g1.makePayment(305.2);

	}

}
