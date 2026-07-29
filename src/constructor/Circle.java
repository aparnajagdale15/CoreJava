package constructor;

public class Circle {
	double radius;
	
	 Circle() {
	       radius = 5;
	    }

	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	public static void main(String[] args) {
		Circle c1 = new Circle();

        System.out.println("Radius: " + c1.radius);
        System.out.println("Area: " + c1.calculateArea());

	}

}
