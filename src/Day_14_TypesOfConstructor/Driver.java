
package Day_14_TypesOfConstructor;

public class Driver {
public static void main(String args[]) {
	Account ac = new Account();
    System.out.println(ac.name + "," + ac.amount);
    Account ac2 = new Account(8000,"Rohit"); 
	System.out.println("Name : " + ac2.name + "," + "Amount : " + ac2.amount);
}
}
