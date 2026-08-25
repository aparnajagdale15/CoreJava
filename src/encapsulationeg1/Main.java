package encapsulationeg1;

public class Main {

	public static void main(String[] args) {
		Student s= new Student();
		s.setName("Aparna");
		s.setAge(30);
		
		System.out.println("Studentname: " +s.getName());
		System.out.println("Studentage: " +s.getAge());
	}

}
