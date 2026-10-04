package Day_11_AccModi;

public class MainOrder {
  public static void main(String args[]) {
	  
	  System.out.println("Driver.Main() Start");
	  //Calling placeOrder method from OrderMngmt class 
	  OrderMngmt po = new OrderMngmt();
	  // Create object of OrderMngmt class and used for calling placeOrder method
	   po.placeOrder("iphone");
	   
	  System.out.println("Driver.Main() End");
  }
	
	
}
