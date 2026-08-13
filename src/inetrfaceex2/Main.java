package inetrfaceex2;

public class Main {

	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		c.refuel(5);
		
		System.out.println();
		
		Bike b=new Bike();
		b.start();
		b.refuel(4);

	}

}
