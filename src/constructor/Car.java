package constructor;

public class Car {
	String make; 
	String model;
	int year;
	
	Car(String m, String mo, int y) { 
		make = m; 
		model = mo; 
		year = y;
	}
	
	public void displayCarInfo() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
	}
	public static void main(String[] args) {
		Car c = new Car("Toyota", "Innova", 2024);
		c.displayCarInfo();

	}

}
