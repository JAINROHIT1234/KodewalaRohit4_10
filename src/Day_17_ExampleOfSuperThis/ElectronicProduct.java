package Day_17_ExampleOfSuperThis;

public class ElectronicProduct extends Product {
	int warranty;
	public ElectronicProduct(String _name, String _price, String _productName , int _warranty) {
	      super(_name,_price,_productName);
	      this.warranty=_warranty;
	}

	
}
