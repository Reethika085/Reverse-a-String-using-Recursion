class SumOfNaturalNumbersRecursion{
static int sum(int n){
 if(n<=1){
 return 1;
 }
 else{
 return n+sum(n-1);
 }
 }
 public static void main(String[] args){
  int number=5;
  int result=sum(number);
  System.out.println("sum of"+number+"is"+result);
  }
  }