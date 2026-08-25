package encapsulationeg2;

public class Main {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpId(101);
		e.setSalary(35000.23);;
		
		System.out.println("EmployeeId : " +e.getEmpId());
		System.out.println("Salary : " +e.getSalary());



	}

}
