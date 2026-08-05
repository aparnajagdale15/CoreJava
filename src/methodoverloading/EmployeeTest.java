package methodoverloading;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.display(101);
		System.out.println();
		e.display(102, "Aparna");
        System.out.println();
		e.display(103, "Sandip", 80.12);

	}

}
