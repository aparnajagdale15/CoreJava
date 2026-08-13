package abstractex2;

public class Main {

	public static void main(String[] args) {
		Payment c1=new CreditCardPayment();
		c1.makePayment(203.5);
		
		Payment c2=new UPIPayment();
		c2.makePayment(307.0);
		
		

	}

}
