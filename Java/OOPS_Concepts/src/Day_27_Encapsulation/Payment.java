package Day_27_Encapsulation;

public class Payment {
    
	private int balance=1000 ;
	
	public Payment(int balance) {
		super();
		this.balance=balance;
	}
	
	// setter
	public void doDebit(int _amount) {
		//Modifying the data
		balance = balance - _amount;
		
	}
	
	
	public void DoCredit (int _amount) {    //allow to change the data with controlled access.
		
		if(_amount>0) {
			//Modifying the data
			balance = balance + _amount;
			
		}
	}
	
	public int getBalance() {
		
		return balance;
	}
	
}
