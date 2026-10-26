package Day_27_Encapsulation;

public class MainShoppingCart {

	public static void main(String[] args) {
	
		Product product = new Product("Almirah",5000,10);
		Product product1	 = new Product("Rotating Chairs",4000,6);	
		ShoppingCart cart = new ShoppingCart("Rohit");
		ShoppingCart cart1 = new ShoppingCart("Amar");
		System.out.println(cart1.getCustomerName());
		cart1.addProduct(product, 2);
		cart1.addProduct(product1, 3);
		System.out.println(product.getStock());
		System.out.println(cart.getCustomerName());
		cart.addProduct(product, 5);
		System.out.println(product1.getStock());
		cart.removeAmount(5000);
		System.out.println(cart.getTotalAmount());
//		cart.addProduct(product,1);
		
		

	}

}
