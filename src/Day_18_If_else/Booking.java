package Day_18_If_else;

/**
 * This class is responsible for booking the tickets of passenger. 
 */

public class Booking {
	
     //More than 6 pass in per PNR is not allowed.
	
	public void doBooking( String from , String to , int noOfpnx) 
	{
	      int PNR;
	      
	   if( noOfpnx > 6) //If true then then this condition  is executed
	   { 
		  System.out.println("Do not allowed more than 6 Pnx according to IRCTC");
		    
	   }
	   //If above condition is false then execution continues
	   else {
		   
		   PNR = 784596;
		   System.out.println("The PNR number is :" + PNR);
		   System.out.println("Your seat is Confirmed");
		   System.out.println("Your seat number is 21 A");
		   
		   
	   }
	   
		
	}

}
