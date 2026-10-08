package DAy_19_Arrays;

import java.util.Iterator;

public class CitiesName {
  
	public static void main(String args[]) {
		
		String cities [] = new String [7];
		cities [0] = "Banglore";
		cities [1] = "Shimla";
		cities [2] = "Manali";
		cities [3] = "Bhopal";
		cities [4] = "Hydrabad";
		cities [5] = "Sagar";
		cities [6] = "Bhuvneswar";
		
		
		for(int i= 0; i < cities.length ; i++ ) {
			
			if(cities[i].startsWith("B")) {
				System.out.println("The City Name which Start with S letter :" + cities[i]);
			}
			
			
		}
		
		
	}
	
}
