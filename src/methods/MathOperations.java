package methods;

public class MathOperations {
	public static void multiplyNumbers(int a,int b) {
		int result1=a*b;
		System.out.println("Multiplication result is : "+ result1);
	}
	public void addNumbers(int c, int d) {
		int sum = c+d;
		System.out.println("Sum is : "+ sum);
	}

	public static void main(String[] args) {
		multiplyNumbers(5,10);
		MathOperations m1= new MathOperations();
		m1.addNumbers(10, 20);

	}

}
