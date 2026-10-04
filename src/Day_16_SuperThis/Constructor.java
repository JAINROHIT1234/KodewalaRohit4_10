package Day_16_SuperThis;


class Super {
	
	Super(){
		super();
		System.out.println("Hey i'm present in Super class");
	}
		
}


class child{
	public void hello() {
		System.out.println("Hello");
	}
}

public class Constructor extends Super  {
	
	String userName;
	String userId;
	String mobileNo;
	
	Constructor(String _userName, String _userId , String _mobileNo){
		super(); //calling super class constructor without arg.\
		// first line of constructor is either super or this . If you are not 
		//writing compiler will consider super()
		//this(200); 
		//is used for calling there own class constructor
		this.userName=_userName;
		this.userId=_userId;
		this.mobileNo=_mobileNo;
		
	}
	
	Constructor(int age)
	{
		System.out.println("xysbxb....");
    }

}
