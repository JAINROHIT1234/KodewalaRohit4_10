package Day_27_Encapsulation;

public class ShoppingCart {

	private String customerName;
	private double totalAmount = 0;

	public ShoppingCart(String customerName) {
		this.customerName = customerName;
	}

	void addProduct(Product product, int quantity) {

		if (quantity <= 0) {
			System.out.println("Invalid quantity");
		} else if (quantity > product.getStock()) {
			System.out.println("Insufficient stock");
		} else {

			// 1. Reduce the actual product's stock
			product.reduceStock(quantity);

			// 2. Calculate the price and add it
			// to the existing totalAmount
			totalAmount = totalAmount + (product.getPrice() * quantity);

			System.out.println("Product added successfully");
			System.out.println("Current total: " + totalAmount);
		}
	}

	void removeAmount(double amount) {
		if (amount > 0 && amount < totalAmount) {
			totalAmount = totalAmount - amount;
		}

	}

	public String getCustomerName() {
		return customerName;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

}
