package Day_29_Inheritance_Override;

public class BankAccount {

	String accountHolder;
	double balance;

	BankAccount(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	void deposit(int amount) {
		if (amount > 0 && amount != 0) {
			balance = balance + amount;
		} else {
			System.out.println("Please Enter Valid Amount");
		}
	}

	public double displayBalance() {
		return balance;
	}

	public String displayName() {
		return accountHolder;
	}

}
