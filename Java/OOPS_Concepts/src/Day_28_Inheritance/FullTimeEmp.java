package Day_28_Inheritance;

public class FullTimeEmp extends EmpSal {

	String type;

	FullTimeEmp(String name, String empId, String department, String type) {

		super(name, empId, department);
		this.type = type;

	}
     
	@Override
	void calculateSalary(int perHour, int day) {

		salary = perHour * day;

		System.out.println("Proper salary that payed to Normal employee  " + salary);

	}

}

class PartTimeEmp extends EmpSal {

	boolean doOtherWork;

	public PartTimeEmp(String name, String empId, String department, boolean doOtherWork) {
		super(name, empId, department);
		this.doOtherWork = doOtherWork;
	}
     
	@Override
	void calculateSalary(int perHour, int day) {

		salary = perHour * day;
		System.out.println("Less Salary due to PartTime schedule  " + salary);

	}
}
