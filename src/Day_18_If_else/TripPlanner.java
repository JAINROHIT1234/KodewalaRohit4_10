package Day_18_If_else;

public class TripPlanner {
	
	public String planner(String src , String des , int budget) {
		String suggestion=null;
		if(budget<1000) {
			suggestion="You can only stay at Home and Enjoy Netflix";
			System.out.println(suggestion);
		}
		else if(budget>1000 && budget <=3000) {
			suggestion="You can moving inside the City only";
			System.out.println(suggestion);
		}
		else if(budget>3000 && budget <=5000) {
			suggestion="You can travel near by cities of Banglore";
			System.out.println(suggestion);
		}
		else 
		{
		System.out.println("You can Travel anywhere in the country");	
		}
		
		return suggestion;
		
		
	} 
	

}
