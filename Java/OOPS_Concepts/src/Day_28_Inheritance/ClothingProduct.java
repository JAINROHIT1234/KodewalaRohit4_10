package Day_28_Inheritance;

public class ClothingProduct extends Product {

	String brand;
	String fabric;
	int pieces;

	public ClothingProduct(String _productName, String _discription, int _quantity, String _status, String brand,
			String fabric, int pieces) {
		super(_productName, _discription, _quantity, _status);
		this.brand = brand;
		this.fabric = fabric;
		this.pieces = pieces;
	}

	void showCloth() {

		showProduct();
		System.out.println(brand);
		System.out.println(fabric);
		System.out.println(pieces);

	}

}
