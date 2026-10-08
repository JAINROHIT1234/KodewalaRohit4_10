package Day_20_Types_of_Loops;

import java.util.Scanner;

public class LuckyNo {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int luckyNo = 56;
		int userInput = 0;

		while (luckyNo != userInput) {

			System.out.println("Please enter the number :");
			userInput = sc.nextInt();

			if (luckyNo == userInput) {
				System.out.println("Yay you win !! Your LuckyNo is :" + luckyNo);
			}
			else {
				System.err.println("Try again");
			}

		}

	}

}
