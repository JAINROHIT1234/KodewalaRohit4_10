package Day_13_Constructor;

public class AccountHolder {

	String name ;
	int amount;
	String accountType;
	String email;
	int phoneNo;
	
	AccountHolder(String _name,int _amount,String _accountType,String _email,int _phoneNo){
		
		this.name=_name;
		this.amount=_amount;
		this.accountType=_accountType;
		this.email= _email;
		this.phoneNo=_phoneNo;
		
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(amount);
		System.out.println(accountType);
		System.out.println(email);
		System.out.println(phoneNo);
	}
	
	
}
