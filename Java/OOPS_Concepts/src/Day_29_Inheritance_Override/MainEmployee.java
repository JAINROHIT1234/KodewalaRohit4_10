package Day_29_Inheritance_Override;

public class MainEmployee {

	public static void main(String[] args) {
		Develper d = new Develper("Rohit", 80000, "Java");
		d.work();d.displayDetails();d.writeCode();
		Employee e = new Develper("Amar",50000,"Python");
		e.work();
		//e.writeCode();

	}

}
