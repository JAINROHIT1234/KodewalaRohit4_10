package Day_20_Types_of_Loops;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the Price");
		
		int price=0;
		
		if(sc.hasNextInt()) {
		  price=sc.nextInt();
		}
		else {
			System.out.println("Please enter in a valid Format");
		}
		
		System.out.println("THe Price is : " + price);
		sc.close();

	}

}
