/**
 You have SBI bank customers and following are the attribute of customer.
 *

Customer name 
Account balance
Mobile number

You need to find customers whose balance is less than 2000.Print the name and balance of the customers.

*/

package DAy_19_Arrays;

public class MainSBI {

	public static void main(String[] args) {
		
		SBI user1 = new SBI("Rohit",8000,87845961);
		SBI user2 = new SBI("Rashi",60000,87845961);
		SBI user3 = new SBI("Maya",1000,87845961);
		SBI user4 = new SBI("Rajesh",40000,87845961);
		SBI user5 = new SBI("Roshini",300,87845961);
		SBI user6 = new SBI("Amar",50000,87845961);
		SBI user7 = new SBI("Rohan",800,87845961);
		
		SBI customer [] = new SBI [7];
		
		customer[0]=user1;
		customer[1]=user2;
		customer[2]=user3;
		customer[3]=user4;
		customer[4]=user5;
		customer[5]=user6;
		customer[6]=user7;
		
		for(int i=0; i < customer.length; i++ ) {
		    if(customer[i].balance < 2000) {
		    	System.out.println("Please maintain the balance :" + customer[i].name);
		    	System.out.println("Balance is :" + customer[i].balance);
		    }	
		
			
			
		}
		
		
		
		

	}

}
