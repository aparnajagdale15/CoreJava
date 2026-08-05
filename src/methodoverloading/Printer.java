package methodoverloading;

public class Printer {
	
	void printvalue(int num) {
		System.out.println(" Integer Value : " +num);
	}
	
	void printvalue(double num) {
		System.out.println(" Double Value : " +num);
	}
	
	void printvalue(String text) {
		System.out.println(" String Value : " +text);
	}
	
	void printvalue(Boolean flag) {
		System.out.println(" Boolean Value : " +flag);
	}

	public static void main(String[] args) {
		

	}

}
