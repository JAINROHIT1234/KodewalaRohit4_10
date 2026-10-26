class SumOfTwo {
public static void main(String args[]){
String fNo=Integer.parseInt(args[0]);
String sNo=Integer.parseInt(args[1]);

System.out.println("The sum of given numbers are :", SumOfTwo.sum(fNo,sNo));

}


static int sum (int a , int b){
	return a+b;
}

}