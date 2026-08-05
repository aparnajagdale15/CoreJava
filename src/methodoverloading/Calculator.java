package methodoverloading;

public class Calculator {
	
	 void add(int a, int b) {
	        System.out.println("Sum of two integers: " + (a + b));
	    }

	    void add(double a, double b) {
	        System.out.println("Sum of two doubles: " + (a + b));
	    }

	    void add(int a, int b, int c) {
	        System.out.println("Sum of three integers: " + (a + b + c));
	    }

	    void add(String a, String b) {
	        System.out.println("Concatenated String: " + (a + b));
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
