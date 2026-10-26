class Driver1{

public static void main(String args[]){

System.out.println("From here Main start executing 1");

PlacingOrder po = new PlacingOrder();

System.out.println("Here is your Precious Gift" );
po.TrackOrder("iphone18");

System.out.println("From here Main Stop executing 3rd");


}




}

/*
D:\Kodewala\Notepad_java\Day-11>javac *.java
Driver1.java:9: error: 'void' type not allowed here
System.out.println("Here is your Precious Gift" + po.TrackOrder("iphone"));
                                                               ^
1 error*/