package Day_13_Constructor;

public class MainAccHol {

	public static void main(String[] args) {
		
		System.out.println("Main Start from here");
		AccountHolder acc = new AccountHolder("Rohit",800000,"Saving","jainrohit1901@gmail.com",772496) ;
		AccountHolder acc1 = new AccountHolder("amar",900000,"Saving","amarrohit1901@gmail.com",9562496) ;
		System.out.println(acc);
		System.out.println(acc1);
        acc.display();
        acc1.display();
	}

}
