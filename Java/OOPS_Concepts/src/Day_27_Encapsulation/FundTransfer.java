package Day_27_Encapsulation;

class Bank{

Bank(){
	System.out.println("Welcome to PhonePay");}
}

public class FundTransfer extends Bank {

	private String accountHolder;
	private int accountNumber;
	private double balance;

	public FundTransfer(String _accountHolder, int _accountNumber, double _balance) {
		super();
		this.accountHolder = _accountHolder;
		this.accountNumber = _accountNumber;
		this.balance = _balance;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public int accountNumber() {
		return accountNumber;
	}

	public double getBalance() {

		return balance;

	}

	void doCredit(int _amount) {
		if (_amount > 0) {
			balance = balance + _amount;
			
		}
	}

	void doDebit(int _amount) {
		if (_amount > 0 && _amount < balance) {
			balance = balance - _amount;
		}

	}

	public void transferTo(FundTransfer receive, int amount) {
		if (amount > balance) {
			System.out.println("Insufficient balance");
		} else if (amount < 0) {
			System.out.println("Please deal in positive Number :");
		}

		else {
			balance = balance - amount;
			receive.balance = receive.balance + amount;

			System.out.println("Transfer of amount Successfully");
		}

		

	}

	

}
