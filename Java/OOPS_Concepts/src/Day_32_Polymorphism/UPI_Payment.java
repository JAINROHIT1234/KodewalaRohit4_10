package Day_32_Polymorphism;

public class UPI_Payment extends Payment {
	
	String UPI_ID = "Rohit@UPI";

	void  pay(double amount) {
		System.out.println("Payment of " + amount + " via UPI is Successfull");
	}
	
}
