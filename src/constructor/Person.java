package constructor;

public class Person {
	String name;
	int age;
	
	Person(){
		name = "Aparna";
		age = 30;
		}
	
	public void greet() {
		System.out.println("Hello, my name is " +name);
		System.out.println("My age is " +age);
	}

	public static void main(String[] args) {
		Person p=new Person();
		p.greet();
		

	}
}
