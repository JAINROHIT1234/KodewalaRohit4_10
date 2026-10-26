class Operators {

public static void main(String args[]){
int minAge=18;
int maxAge=60;
String name =args[0];
int userAge = Integer.parseInt(args[1]); // only take valid string which have only valid number like "22" or "526341"

System.out.println("Name of applicant : "+ name);
System.out.println("Eligible for DL if :" + (minAge < userAge));
System.out.println("Eligible for DL if :" + (maxAge > userAge));

System.out.println(( maxAge > userAge) && (minAge < userAge));



}



}