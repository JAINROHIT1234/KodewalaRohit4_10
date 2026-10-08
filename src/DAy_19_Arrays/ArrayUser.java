package DAy_19_Arrays;

public class ArrayUser {

	String name;
	long phoneNO;
	
	 ArrayUser(String _name , long _phoneNO) {
		this.name= _name;
		this.phoneNO = _phoneNO;
	}
	 
	 @Override
	    public String toString() {
	        return "phoneNo = " + phoneNO + ", name = " + name;
	    }
	}

	

