class FundTransfer{
public static void main(String args[]){
System.out.println("Starting main()");

boolean result = FundTransfer.doTransaction(10,"1236545125","859674123");

System.out.println("Is txn Successful ? " + result);

System.out.println("Ending main()");


}

 static boolean doTransaction(int amountToBeTxn,String senAccNo,String recAccNO ){
	 
    System.out.println("Entered doTransaction()");

    System.out.println("Input Received " + amountToBeTxn + " " + senderAccNo + " " + recAccNO);
  
    System.out.println("Exit doTransaction()");
	 
	return true;
}



}