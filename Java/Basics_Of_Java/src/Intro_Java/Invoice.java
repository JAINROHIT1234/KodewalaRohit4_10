package Intro_Java;

 class Invoice extends Object {
    static  int Gst=18;
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;
	
	Invoice(int _amount,String _itemName,String _billingAddress, String _customerId, String _customerName)
	{
	this.amount=	_amount;
	this.itemName=_itemName;
	this.billingAddress=_customerId;
	this.customerName=_customerName;
	}
	
	
	
}


class Driver {
	
	public static void main(String[] args) {
		
		Invoice inv =new Invoice (180000,"iphone","Kodwala BTM 2nd Stage ","C452","Kodewala");
		
		Invoice inv1 =new Invoice (10000,"vivo","Kodwala BTM 2nd Stage ","C4582","Rahul");
		
		System.out.println("first invoice : " + inv.amount + "," + inv.customerId + "," + inv.billingAddress );
		
		System.out.println("Second invoice : " + inv1.amount + "," + inv1.customerId + "," + inv1.billingAddress );
	}
	
	
	
}
