package Day_29_Inheritance_Override;

public class Develper extends Employee {

	String programmingLanguage;
	
	Develper(String name , int salary , String programmingLanguage){
		super(name,salary);
		this.programmingLanguage=programmingLanguage;
		
	}
	
	void writeCode() {
		System.out.println("Developer is Writing code");
	}
	
	
	
}
