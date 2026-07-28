package methods;

public class NonStaticMethod1 {
	public void message() {       //non static method
		System.out.println("Non Static method");
	}

	public static void main(String[] args) {  //creating the object to call nonstatic method.
     NonStaticMethod1 a =new NonStaticMethod1();
     a.message();

	}

}
