package methodoverloading;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.add(5, 10);
		c1.add(3.14, 2.14);
		c1.add(10, 20, 30);
		c1.add("Hello","World");

	}

}
