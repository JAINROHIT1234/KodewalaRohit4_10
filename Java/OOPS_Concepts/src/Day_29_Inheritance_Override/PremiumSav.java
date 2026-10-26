package Day_29_Inheritance_Override;

public class PremiumSav extends SavAccount {

	int rewardPoints;

	PremiumSav(String accounHolder, double balance, double interestRate, int rewardPoints) {
		super(accounHolder, balance, interestRate);
		this.rewardPoints = rewardPoints;
	}

	void addRewardPoints(int points) {

		rewardPoints = rewardPoints + points;
	}
	
	
	public double displayBalance() {
		System.out.println(rewardPoints);
		return balance;
	}
	
	

}
