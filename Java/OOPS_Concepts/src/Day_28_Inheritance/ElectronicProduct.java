package Day_28_Inheritance;

public class ElectronicProduct extends Product {

	boolean InWarranty;
	int warrantyInYear;

	ElectronicProduct(String productName, String discription, int quantity, String status, boolean InWarranty,
			int WarrantyInYear) {
		super(productName, discription, quantity, status);
		this.InWarranty = InWarranty;
		this.warrantyInYear = WarrantyInYear;

	}

	void showElectronicProduct() {
		showProduct();
		System.out.println(InWarranty);
		System.out.println(warrantyInYear);
	}

}
