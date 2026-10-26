class OROperator{
public static void main(String args[]){
int userAmount=Integer.parseInt(args[0]);
int minAmount=1;
int maxAmount=2000;

System.out.print(userAmount > minAmount);
System.out.print(userAmount > maxAmount);

System.out.println(userAmount>minAmount || userAmount>maxAmount);




}


}