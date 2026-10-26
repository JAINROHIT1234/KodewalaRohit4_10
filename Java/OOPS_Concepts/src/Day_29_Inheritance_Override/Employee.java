package Day_29_Inheritance_Override;

public class Employee {

	String name;
	int salary;
	
	
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	void work() {
		System.out.println("Employee is Working");
	}
	
	void displayDetails() {
		System.out.println(name);
		System.out.println(salary);
	}
}
