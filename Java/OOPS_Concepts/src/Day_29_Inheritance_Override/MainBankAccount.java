package Day_29_Inheritance_Override;

public class MainBankAccount {

	public static void main(String[] args) {
		PremiumSav ps = new PremiumSav("Rohit Jain",95000,5,100);
		ps.deposit(5000);
		System.out.println(ps.displayBalance());
		System.out.println(ps.calculateInterest(2));
		ps.addRewardPoints(150);
		
		
		BankAccount ba = new PremiumSav("Amarkuswaha",8000,3,500);
		System.out.println(ba.displayBalance());
		System.out.println(ba.displayName());
	//	ba.calculateInterest(); //These methods are execute because java do not allow 
	//	ba.rewardPoints()                       //to call child object method from parent type reference
		
		
		

	}

}
