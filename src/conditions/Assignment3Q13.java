package conditions;

public class Assignment3Q13 {

	public static void main(String[] args) {
		int num = 60;
		if (num >0) {
	      System.out.println("the number is positive");
	      if (num % 2 ==0) {
	    	  System.out.println("the number is even");
	      } else {
	    	  System.out.println("the number is odd");
	      }
		} else if (num<0) {
			System.out.println("the number is negative");
		} else {
			System.out.println("the number is Zero");
		}

	}

}
