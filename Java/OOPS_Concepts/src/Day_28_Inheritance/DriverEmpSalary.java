package Day_28_Inheritance;

public class DriverEmpSalary {

	public static void main(String[] args) {
		PartTimeEmp pte = new PartTimeEmp("Rohit","Rj123","IT",true);
		pte.calculateSalary(250,30);
		FullTimeEmp fte = new FullTimeEmp("Amar","AK456","IT","FullTime");
		fte.calculateSalary(500,28);

	}

}
