package Day_29_Inheritance_Override;

class Father {

	String name;
	String finalEducation;
	int height;

	Father(String _name, String _finalEducation, int _height) {
		this.name = _name;
		this.finalEducation = _finalEducation;
		this.height = _height;
	}

	void haveBussiness() {
		System.out.println("Father is the Home Holder");
	}

}

class Son extends Father {

	String hobbies;
	int noOfFriend;

	Son(String _name, String _finalEducation, int _height, String hobbies, int noOfFriends) {
		super(_name, _finalEducation, _height);
		this.hobbies = hobbies;
		this.noOfFriend = noOfFriends;
	}

	void playCricket() {
		System.out.println("Goes daily Stadium");
	}

}

class Daughter extends Father {

	String skill;
	boolean haveHobbies;

	Daughter(String name, String finalEducation, int height, String skill, boolean haveHobbies) {
		super(name, finalEducation, height);
		this.skill = skill;
		this.haveHobbies = haveHobbies;
	}

	void likeDance() {

		System.out.println(" Loves to do Dance");

	}

}

public class DriverHeraricalInhe {

	public static void main(String[] args) {
		
		Daughter d = new Daughter("Rashmi","Bsc",5,"KnowDiffrentLanguages",true);
		d.haveBussiness();
		d.likeDance();
		Son s = new Son("Rohit","Btech",6,"Study",8);
		s.haveBussiness();
		s.playCricket();
		
		System.out.println(s.name);
		System.out.println(s.height);
		
		Father f = new Father("RajeshKumarjain","Mcom",6);
		System.out.println(f.name);
		System.out.println(f.height);
		

	}

}
