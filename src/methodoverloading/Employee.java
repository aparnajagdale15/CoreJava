package methodoverloading;

public class Employee {
	
	void display(int id) {
        System.out.println("Employee ID: " + id);
    }

    void display(int id, String name) {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }

    void display(int id, String name, double salary) {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

}
