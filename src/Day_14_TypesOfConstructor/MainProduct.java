package Day_14_TypesOfConstructor;

public class MainProduct {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product("Iphone-18 Latest","Apple");
		Product p3 = new Product("Laptop",1200000,"Lenovo",16);
		
		System.out.println(p2.productName);
		System.out.println(p2.description);
	    System.out.println(p3.quantity);
		System.out.println(p3.price);
	}

}
