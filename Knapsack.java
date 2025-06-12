public class Knapsack{
 public static int Knapsack(int[] weight,int[] profit,int W,int n){
  if(n==0||W==0){
   return 0;
   }
   if(weight[n-1]>W){
    return Knapsack(weight,profit,W,n-1);
	}
	else{
	 int include=profit[n-1]+Knapsack(weight,profit,W-weight[n-1],n-1);
	 int exclude=Knapsack(weight,profit,W,n-1);
	 return Math.max(include,exclude);
	 }}
	 public static void main(String[] args){
	  int W1=4;
	  int[] profit1={1,2,3};
	  int[] weight1={4,5,1};
	  int n1=profit1.length;
	  int result=Knapsack(weight1,profit1,W1,n1);
	  System.out.println("Output for Test Case:"+result);
	  }
		 }