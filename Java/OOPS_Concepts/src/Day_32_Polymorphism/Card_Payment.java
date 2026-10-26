package Day_32_Polymorphism;

public class Card_Payment extends Payment {

	int cardNo = 5201;
	
	void pay(double amount) {
		
		System.out.println("Payment of " + amount + "via card is Successfull");
		
	}

}
