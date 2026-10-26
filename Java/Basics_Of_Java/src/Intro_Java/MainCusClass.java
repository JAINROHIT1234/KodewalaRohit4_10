package Intro_Java;

public class MainCusClass {

	public static void main(String []args) {
		
		Cust cus = new Cust("Rohit",4521,789654123);
		Cust cus1 = new Cust("Rohit",263,789654123);
		Cust cus2 = new Cust("Rohit",1235,789654123);
		Cust cus3 = new Cust("Rohit",8596,789654123);
		Cust cus4 = new Cust("Rohit",1254,789654123);
		Cust cus5 = new Cust("Rohit",9653,789654123);
		
		
		Cust Holder[]= {cus,cus1,cus2,cus3,cus4,cus5};
		
		for(int  i=0;i< Holder.length;i++) {
			
			if(Holder[i].accBal<2000) {
			
			System.out.println(Holder[i].accBal);	
			System.out.println(Holder[i].name);	
			}
			}
			
		}
		
		
		
	}
	

