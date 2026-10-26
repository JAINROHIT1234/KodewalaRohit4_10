package Intro_Java;

 class Super extends Object{
	 
 }

public class User {
 String userName;
 String userID;
 String mobile;
 
 User(String _userName, String _userID ,String _mobile){
	 this.userID=_userID;
	 this.userName=_userName;
	 this.mobile=_mobile;
 }
 
 User(int age){
	 System.out.println("User() ....no args");
 }
	
}
