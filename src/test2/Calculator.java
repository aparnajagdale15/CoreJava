package test2;

public class Calculator {
	
	public static void display() {
		System.out.println("Welcome to calculator");
	}
	
	public void addnumbers(int c, int d) {
		int sum=c+d;
		System.out.println("Sum is : " +sum);
	}

	public static void main(String[] args) {
		display();
		Calculator c=new Calculator();
		c.addnumbers(5, 10);
		
	
		
	}

}
