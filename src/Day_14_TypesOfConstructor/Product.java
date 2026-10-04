package Day_14_TypesOfConstructor;

public class Product {

	String productName;
	int price;
	String description;
	int quantity;
	
	
	Product(){
		System.out.println("Sorry,No data found");
	}
	
	Product(String _productName ,String _description){
		this.productName=_productName;
		this.description=_description;
	}
	
	Product(String _productName, int _price ,String _description ,int _quantity ){
		
		this.productName=_productName;
		this.description=_description;
		this.price=_price;
		this.quantity=_quantity;
		
	}
	
	
	
}
