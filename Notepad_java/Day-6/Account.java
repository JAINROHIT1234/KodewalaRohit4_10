class Account {
int amount = 5000; // Instance variable
static String bankName = "Central_Bank"; //Static variables

public static void main(String args[]){

Account acc = new Account();
System.out.println("Welcome to" + Account.bankName + "bank"); // by the help of Class
System.out.println("The available balance is :" + acc.amount); //by the help of Object creation 
Account.User();
acc.AccHolder();
}

public static void User(){
System.out.println("Welcome to" + Account.bankName + "Second branch");
}

public void AccHolder(){
	System.out.println("Thank you for Opening the new account :");
	
}

}