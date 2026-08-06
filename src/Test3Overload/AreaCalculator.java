package Test3Overload;

public class AreaCalculator {
	
	void calculateArea(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }
	
	 void calculateArea(int length, int breadth) {
	        int area = length * breadth;
	        System.out.println("Area of Rectangle: " + area);
	    }
	
	 void calculateArea(double radius) {
	        double area = 3.14 * radius * radius;
	        System.out.println("Area of Circle: " + area);
	    }
	

}
