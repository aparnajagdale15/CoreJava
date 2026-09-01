package string;

public class StringExample {

	public static void main(String[] args) {
		String str="Hello,World";
		System.out.println("Length of the string: " + str.length());
		
		String str2="java programming.";
		System.out.println("Uppercase: " + str2.toUpperCase());
		System.out.println("Lowercase: " + str2.toLowerCase());
		
		System.out.println("index 5 to end : " + str2.substring(5));
		System.out.println("index 0 to 4 : " + str .substring(0,5));

	}

}
