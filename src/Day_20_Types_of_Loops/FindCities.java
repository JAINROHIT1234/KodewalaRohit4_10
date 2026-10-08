package Day_20_Types_of_Loops;

public class FindCities {
 
	 public static void main(String args[]) {
		 String cities [] =  {"jabalpur","gwalior","sagar","pipariya","sagar","bhind","satna","narmadapuram","sivni","sihora"};
           
		 for(int i = 0 ; i <= cities.length; i++) {
			
			 if(cities[i].equals("sagar")) {
				 System.out.println("yes this city is in a list :" + cities[i]);
				 break;
			 }
			 
			 
			 
		 }
		 
	 }
}
