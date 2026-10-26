class SumOf {

public static void main(String args[]){
int first=Integer.parseInt(args[0]);
int second=Integer.parseInt(args[1]);

int result = SumOf.Add(first,second);
System.out.println("The sum of two numbers are :" + result );

};

static int Add(int num1 , int num2){
return num1 + num2;

}


}