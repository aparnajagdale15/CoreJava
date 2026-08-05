package methodoverloading;

public class Area {
	
	void calculateArea(int side) {
		System.out.println("Area of Square : " +(side*side));
	}
	
	void calculateArea(int length, int width) {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    void calculateArea(double radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

}
