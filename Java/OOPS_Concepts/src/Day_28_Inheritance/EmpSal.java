package Day_28_Inheritance;

public class EmpSal {
	
	String name;
	String empId;
	String department;
	int salary;
	
	EmpSal(String name , String empId , String department){
		super();
		this.name=name;
		this.empId=empId;
		this.department=department;
	}
	
	void calculateSalary(int perHour , int day) {
	
		salary = perHour * day ;
        
		System.out.println("Your Salary is Calculated : " + salary);
		
	}

}
