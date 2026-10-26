package Day_29_Inheritance_Override;

public class SavAccount extends BankAccount {

	double interestRate;

	SavAccount(String accountHolder, double balance, double interestRate) {
		super(accountHolder, balance);
		this.interestRate = interestRate;

	}

	double calculateInterest(int timeInYears) {
		double interest;
		interest = balance * timeInYears * interestRate / 100;
		return interest;
	}
}
