package methods;

public class Rectangle {
	public static int calculateArea(int l,int w) {
		int area=l*w;
		return area;
	}

	public static void main(String[] args) {
		System.out.println("Area of rectangle is: " +calculateArea(5,6));

	}

}
