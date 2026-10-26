package Day_27_Encapsulation;

public class MainStudent {

	public static void main(String[] args) {
		Student stu = new Student("Rohit",80);
		Student stu2 = new Student("Aniket",85);
		stu.updateMarks(0);
		stu.updateMarks(-10);
		System.out.println(stu.getName());
		System.out.println(stu.getMarks()); 
		stu2.updateMarks(101);
		System.out.println(stu2.getName());
	    System.out.println(stu2.getMarks());
		

	}

}
