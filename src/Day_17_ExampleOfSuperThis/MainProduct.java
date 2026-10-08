package Day_17_ExampleOfSuperThis;

public class MainProduct {
	
	public static void main(String args[]) {
		
		ElectronicProduct electricProduct = new ElectronicProduct("Fridge","18000","Ffd1233",2);
		System.out.println(electricProduct.name );
		System.out.println(electricProduct.price);
		System.out.println(electricProduct.productId );
		System.out.println(electricProduct.warranty);
		
		ElectronicProduct electricProduct2 = new ElectronicProduct("mixer","1800","Fd1233",3);
		System.out.println(electricProduct2.name );
		System.out.println(electricProduct2.price);
		System.out.println(electricProduct2.productId );
		System.out.println(electricProduct2.warranty);
		
	}

}
