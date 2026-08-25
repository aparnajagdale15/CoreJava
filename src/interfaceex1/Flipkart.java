package interfaceex1;

public class Flipkart implements ECommerce {

	@Override
	public void placeOrder(String item, int quantity) {
		System.out.println("Order Placed on Flipkart: " +item+ " X " +quantity);
		
	}

}
