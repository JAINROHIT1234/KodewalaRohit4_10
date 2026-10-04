package Day_15_Degubbing_keys;

class Invoice {
	
    static int gst=18;
	String customerName;
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	
	
	Invoice(String _customerName,int _amount,String _itemName,String _billingAddress,String _customerId ){
		
      this.customerName=_customerName;
      this.amount=_amount;
      this.itemName=_itemName;
      this.billingAddress=_billingAddress;
      this.customerId=_customerId;
		
	}
	
	void display() {
		
	  System.out.println(customerName);
	  System.out.println(amount);
	  System.out.println(itemName);
	  System.out.println(billingAddress);
	  System.out.println(customerId + "\n");
	  	
	}
	

}

public class Main_Invoice{
	public static void main(String args[]) {
		
	 Invoice.gst=28;
	 Invoice inv = new Invoice("RohitJain",1800000,"Iphone18","Bhopal,New Market","cd124563");
	 Invoice inv1 = new Invoice("AmrJain",100000,"Iphone17","gwalior,New Market","cd124583");
	 inv.display();
	 inv1.display();
	 System.out.println("First Invoice :" + inv.customerName + inv.billingAddress + " , " + inv.gst);
	 System.out.println("Second Invoice :" + inv1.customerName + inv1.billingAddress + "," +inv1.gst);
		
		
		
	}
	
}
