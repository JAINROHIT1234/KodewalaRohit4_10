package Day_17_ExampleOfSuperThis;

public class User {
	/**
	 * This class represent the Netflix user.
	 */
	String name;
	String type;
	String country;
	
	User(String _name, String _type, String _country){
		
		this.name=_name;
		this.type=_type;
		this.country=_country;
	
	}
	
	public User(){
		this("Rohit","Guest","IN");//calling User class constructor
	}
	
	

}
