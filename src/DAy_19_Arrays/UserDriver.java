package DAy_19_Arrays;


public class UserDriver {
  public static void main(String args[]) {
	  ArrayUser user1=new ArrayUser("Rohit jain", 772496075 );
	  ArrayUser user2 = new ArrayUser("Ronak jain",888491024);
	  ArrayUser user3 = new ArrayUser("Prateek jain",888491024);
	  ArrayUser user4 = new ArrayUser("Aniket jain",888491024);
	  ArrayUser user5 = new ArrayUser("Sanskar jain",888491024);
	  ArrayUser user6 = new ArrayUser("Donny jain",888491024);
	  
	  
	  ArrayUser user [] = new ArrayUser[7];
	  
	  user[0]=user1;
	  user[1]=user2;
	  user[2]=user3;
	  user[4]=user5;
	  user[3]=user4;
	  user[5]=user6;
	  
//	  System.out.println(user);
	  
	  System.out.println(user[0]);
	  System.out.println(user[1]);
	  System.out.println(user[2]);
	  System.out.println(user[3]);
	  System.out.println(user[4]);
	  System.out.println(user[5]);
	  
	  
  }
}
