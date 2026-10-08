package Day_20_Types_of_Loops;

import java.util.Scanner;
public class Scanning {
   public static void main(String args[]) {
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Hey ! Can i know your name...");
	   String name = sc.next();
	   System.out.println("What's your age");
	   int age=sc.nextInt();
	   sc.nextLine();
	   System.out.println("Ok,Can i know you full address");
	   String address=sc.nextLine();
	   
	   System.out.println("Name :" + name);
	   System.out.println("Age" + age);
	   System.out.println("Address :" + address);
	   
	   
	   
   }
}
