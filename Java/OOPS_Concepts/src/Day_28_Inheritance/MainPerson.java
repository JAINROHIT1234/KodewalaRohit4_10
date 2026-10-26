package Day_28_Inheritance;

public class MainPerson {

	public static void main(String[] args) {
		Teacher  tea = new Teacher();
		tea.walk();
		Person p = new Person();
		p.walk();
		p = new Students(); 
		Students s = new Students();
		s.learner();

	}

}
