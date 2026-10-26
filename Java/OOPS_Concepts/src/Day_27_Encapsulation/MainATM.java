package Day_27_Encapsulation;

public class MainATM {

	public static void main(String[] args) {
		ATM atm = new ATM("Rohit",10000);
		System.out.println(atm.getName());
		System.out.println(atm.getBalance());
		atm.deposit(2000);
		System.out.println(atm.getBalance());
		atm.withDraw(3000);
		System.out.println(atm.getBalance());
		atm.withDraw(20000);
		System.out.println(atm.getBalance());

	}

}
