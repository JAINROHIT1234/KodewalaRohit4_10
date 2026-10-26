package Day_29_Inheritance_Override;

class Account {

	public void openAccount(String userId, String email) {

		System.out.println("Account.openAccount()");

	}

}

class SavingAccount extends Account {
	@Override // changing the super class method's functionalities.
	public void openAccount(String userId, String email) {

		System.out.println("SavingAccount.openAccount()");

	}

}

class SrCitAccount extends SavingAccount {

	public void openAccount(String userId, String email) {

		System.out.println("SrCitAccount.openAccount()");

	}

}

class PensionAccount extends SrCitAccount {

	public void openAccount(String userId, String email) {

		System.out.println("PensionAccount.openAccount()");

	}

}

public class Driver {

	public static void main(String args[]) {
		PensionAccount pa = new PensionAccount();
		pa.openAccount("kd7848", "jainwala@gmail.com");
	}

}

/*
 * Disadvantages of Inheritance Tightly coupled -->Means if we change parent
 * class property so we need to change child changes property other wise it
 * create problems Heavy loading -->Means if we load parameter on a child class
 * so it unnecessary load in parent class also
 * 
 */
