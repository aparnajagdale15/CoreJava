package methodoverridingeg2;

public class Main {

	public static void main(String[] args) {
		
		Employee e;
		e=new Employee();
		e.calculateSalary();
		System.out.println();
		e=new Manager();
		e.calculateSalary();
		System.out.println();
		e=new Developer();
		e.calculateSalary();
		

	}

}
