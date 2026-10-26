/*
WAP program to print order_ID, product name , placed by and address using 
command line prompt
*/
class OrderOf
{
public static void main(String arr[]){

String orderId=arr[0];
String productName=arr[1];
String orderBy =arr[2];
String deliverAt =arr[3];



System.out.println("OrId :" + orderId);
System.out.println("productName" + productName);
System.out.println("OrderBy" + orderBy);
System.out.println("Delivered at " + deliverAt);

}




}