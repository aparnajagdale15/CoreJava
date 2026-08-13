package interfaceexample1;

public class Main {

	public static void main(String[] args) {
		ECommerce a=new Amazon();
		a.placeOrder("Laptop", 2);
		
		ECommerce f=new Flipkart();
		f.placeOrder("Mobile", 1);

	}

}
