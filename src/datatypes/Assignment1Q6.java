package datatypes;

import java.util.Scanner;

public class Assignment1Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Full name: ");
		String name = sc.next();

		System.out.println("Enter coursename: ");
		String courseName = sc.next();

		System.out.println("Enter age: ");
		int age = sc.nextInt();

		System.out.println("My name is " + name + ". My coursename is " + courseName + ". My age is " + age + ".");
	}

}
