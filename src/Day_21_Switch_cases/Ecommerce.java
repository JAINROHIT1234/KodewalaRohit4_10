package Day_21_Switch_cases;

public class Ecommerce {

	public static void main(String args[]) {
		
		int purchaseAmount = Integer.parseInt(args[0]);
		String customerType = args[1];
		
		Ecommerce disc = new Ecommerce();
		double discnt = disc.discount(customerType,purchaseAmount);
		
		System.out.println("Purchase_Amount : " + purchaseAmount );
		System.out.println("Customer_Type :" + customerType);
		System.out.println("Discount Amount :" + discnt);
		System.out.println("Amount after Discount : " + (purchaseAmount - discnt) );
		
	}
	
	
	 double discount(String type , int amount) {
		 double discount=0;
		 if(amount>1000) {
			 switch(type) {
			 case "Gold":
				 discount = amount * 20/100;
			     break;
			 case "Silver":
				 discount= amount * 10/100;
			     break;
			 case "Regular":
				 discount = amount * 05/100;
			     break;
			 default:
				 System.out.println("Invalid Input");
				 break;
			 }
			 
			 if(discount>2500) {
				 discount=2500;
			 }
			  
		 }
		 
		 return discount;
		 
		 
	 }
	
	
}
