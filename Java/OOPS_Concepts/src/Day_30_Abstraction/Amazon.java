package Day_30_Abstraction;

public class Amazon {

	public boolean placeOrder(String name, String address, String gmail) {
		
		viewProducts(name);
		addToCart();
		totalAmount();
		paymentOption();
		makePayment(gmail);
		gotMsgOfPlacingOrder();
		
		return true;
	}

	private boolean viewProducts(String name) {

		System.out.println("At this Moment customer is review Product");

		return true;
	}

	private String addToCart() {

//		System.out.println("Customer like that product so he add on Cart");
		return "Product added Successfully";

	}

	private void totalAmount() {

		System.out.println("Calculate Total of the product after discount");

	}

	private void paymentOption() {

		System.out.println("Customer have choice to make payment via COD,UPI or diffrent card");

	}

	public void makePayment(String gmail) {

		System.out.println("Here customer done there payment");
	}

	private void gotMsgOfPlacingOrder() {

		System.out.println("No he/she got msg of ordering procuct successfully");

	}

}
