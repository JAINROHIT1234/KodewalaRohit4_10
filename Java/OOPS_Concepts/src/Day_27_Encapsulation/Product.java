package Day_27_Encapsulation;

public class Product {

	private String productName;
	private final double price;
	private int stock;
	
	public Product(String productName, double price, int stock) {
		super();
		this.productName = productName;
		this.price = price;
		this.stock = stock;
		
	}
	
	
	void reduceStock(int quantity) {
		 if(quantity > 0 && quantity < stock) {
			 stock = stock - quantity;
		 }else {
			 System.out.println("Not Available,Quantity exceed Stock");
		 }
		
	}
	
	public String getProductName(){
		return productName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getStock() {
		return stock;
	}
	
	
}
