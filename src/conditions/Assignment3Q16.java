package conditions;

public class Assignment3Q16 {

	public static void main(String[] args) {
		String username ="admin";
		String pass = "1234";
		if (username.equals("admin")) {
			System.out.println("username is " +username);
		 if (pass.equals("1234")) {
			 System.out.println("Login successful");
		 } else {
			 System.out.println("invalid credential ");
		 }

	} else {
		System.out.println("invalid credentials bcoz username");
	}
	
}
}

