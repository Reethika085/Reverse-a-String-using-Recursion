import java.util.HashMap;
import java.util.objects;
public class KnapsackMemo{
 static class key{
  int n,W;
  key(int n,int W){
   this.n=n;
   this.W=W;
   }
   @Override
   public boolean equals(Object o){
    if(this==0)return true;
	if(!(o instanceof key))return false;
	Key key=(key)o;
    return n==key.n&&W==key.W;}
	}
	@Override
	public int hashCode(){
	 return objects.hash(n,W);
	 }
	 public static int KnapsnapMemo(int[] weight,int[] profit,int W,int n,Map<Key,Integer>memo){
	  if(n==0||W==0){
	   return 0;
	   }
	   Key key = new Key(n,W);
	   if(memo.containskey(key)){
	    return memo.get(key);
		int result;
		if(weight[n-1]>W){
		 result=KnapsackMemo(weight,profit,W,n-1,memo);
		 }
		 else{
		  int include=profit[n-1]+KnapsackMemo(weight,profit,W-weight[n-1],n-1,memo);
		  int exclude=KnapsackMemo(weight,profit,W,n-1,memo);
		  return Math.max(include,exclude);
		  }
		  memo.put(key,result);
		  return result;
		  }}
		  public static void main(String[] args){
		   int W1=4;
		   int[] profit1={1,2,3};
		   int[] weight1={4,5,1};
		   int n1=profit1.length;
		   Map<key,Integer>memo=newHashMap<>();
		   System.out.println("Output(Memoization):"+KnapsackMemo(weight1.profit1,W1,n1,memo));
		   }
		   }