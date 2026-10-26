package Day_27_Encapsulation;

public class ATM {

	private String accountHolder;
	private double balance;

	public ATM(String _accountHolder, double _balance) {
		super();
		this.accountHolder = _accountHolder;
		this.balance = _balance;
	}

	void deposit(double amount) {
		if (amount > 0 && amount > 0) {
			balance = balance + amount;
		} else {
			System.out.println("Invalid amount");
		}
	}

	void withDraw(double amount) {
		if (amount < balance && amount >= 0) {
			balance = balance - amount;
		}else {
			System.out.println("Something went wrong in WithDraw");
		}

	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return accountHolder;
	}

}
