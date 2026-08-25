package encapsulationeg2;

public class Employee {
	
	private int empId;
	private double salary;
	
	public void setEmpId(int id) {
		empId=id;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public double getSalary() {
		return salary;
	}

}
