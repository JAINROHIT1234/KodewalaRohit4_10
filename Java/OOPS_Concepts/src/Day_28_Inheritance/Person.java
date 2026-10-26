package Day_28_Inheritance;

public class Person {

	String name;
	String address;

	void walk() {
		System.out.println("Person is able to walk");
	}

}

class Teacher extends Person {
	String subject;

	void teach() {
		System.out.println("Teacher is Teaching");

	}
}

class Students extends Person {

	String courseName;

	void learner() {
		System.out.println("Students are Learning with Teacher");
	}

}
