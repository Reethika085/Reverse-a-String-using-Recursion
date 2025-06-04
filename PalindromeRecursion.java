class PalindreomeRecursion{
 static boolean isPalindrome(String S,int start,int end){
  if(start>=end){
   return true;
   }
   if(S.charAt(start)!=S.charAt(end)){
    return false;
	}
	return isPalindrome(S,start+1,end-1);
 }
	public static void main(String[] args){
		String s="madam";
	if(isPalindrome(s,0,s.length()-1)){
	System.out.println(s+"is palindrome");
	}
	else{
	System.out.println(s+"is not palindrome");
     }
	}}