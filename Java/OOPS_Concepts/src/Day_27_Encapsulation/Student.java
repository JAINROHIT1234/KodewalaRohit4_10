package Day_27_Encapsulation;

public class Student {


	private String name;
	private int marks;
	
	public Student(String _name, int _marks) {
		super();
		this.name = _name;
		this.marks = _marks;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public String getName() {
		
		return name;
	}
	
	 void updateMarks(int newMarks) {
		if(newMarks >= 0 && newMarks <= 100 ) {
			marks = newMarks;
		}
		else {
			System.out.println("Invalid Marks");
		}
		
		
	}
	
}
