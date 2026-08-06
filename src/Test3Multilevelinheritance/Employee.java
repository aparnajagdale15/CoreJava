package Test3Multilevelinheritance;

public class Employee extends Department {
	
	String employeeName = "Aparna";
    int employeeId = 101;

    void showEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }

}
