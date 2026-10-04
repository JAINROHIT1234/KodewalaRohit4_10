package Day_14_TypesOfConstructor;

public class Account {
	
	int amount;
	String name;
	
//	If developer is not proving any constructor in a class then compiler will add default constructor(no args constructor).
	
	Account()
	{
		System.out.println("Hey,i'm using eclipse");
	}
	
	Account(int _amount, String _name){
		this.amount=_amount;
		this.name=_name;
	}
	
		
		
	

}
