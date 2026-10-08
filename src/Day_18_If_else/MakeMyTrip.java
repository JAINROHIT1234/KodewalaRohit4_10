package Day_18_If_else;

public class MakeMyTrip {

	void appliedDis(String src , String des , int fare) {
		
		if(fare<=5000) {
			System.out.println("There is No discount available");
		}
		else if (fare>5000 && fare <=10000) {
			System.out.println("You get 10% Discount on amount");
		}
		else if (fare>10000) {
			System.out.println("Yay ! you got 15 % discount");
		}
		else {
			System.out.println("The Maximum discount per customer is rs1250");
		}
		
		
	}
}
