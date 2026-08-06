package Test3Overload;

public class Main {

	public static void main(String[] args) {
		AreaCalculator a=new AreaCalculator();
		a.calculateArea(5);
		a.calculateArea(5, 10);
		a.calculateArea(3.15);

	}

}
