package Day_28_Inheritance;

class Employee {

	String name;
	String address;
	private String empCode;

	Employee(String name, String address) {
		this.name = name;
		this.address = address;

	}

	public void markId(String emId) {
		System.out.println("Emoloyee is Registered");

	}

}

class Manager extends Employee {
	
	int mngPhone ;
	
       Manager(String name, String address , int mngPhone){
    	   super(name,address);
    	   this.mngPhone=mngPhone;
  
     } 

	public void doSomething() {
		System.out.println(name);
		System.out.println(address);
		// System.out.println(empCode);

	}

}

public class DriverEmployee {

	public static void main(String[] args) {

		Manager mng = new Manager("Rohit","Btm Layout",789654123);
		//System.out.println(mng.name);
		//System.out.println(mng.address);
		mng.doSomething();
		mng.markId("hello");

	}

}
