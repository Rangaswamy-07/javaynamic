
public class fibonacci
{
    static int c=0;
    public static int fibn(int n,int[] memo){
      if(memo[n] != -1) return memo[n];
      c++;
      if(n<=1) return n;
      memo[n] = fibn(n-1,memo)+fibn(n-2,memo);
     return memo[n];
	}
	public static void main(String[] args){
	    int n =5;
	    int [] memo = new int[n+1];
	    for(int i=0;i<memo.length;i++){
	        memo[i]=-1;
	    }
	    System.out.println(fibn(n,memo));
	    System.out.println(c);
	}
}
