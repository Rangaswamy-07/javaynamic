public class commonsequence
{
	public static void main(String[] args) {
		String s1="abcde";
		String s2="abc";
		int m = s1.length();
		int n = s2.length();
		int [][] arr=new int[m+1][n+1];
		for(int i=m-1;i>=0;i--){
		    for(int j=n-1;j>=0;j--){
		        if(s1.charAt(i) == s2.charAt(j)){
		            arr[i][j] = 1+arr[i+1][j+1];
		        }
		        else{
		            arr[i][j] = Math.max(arr[i][j+1],arr[i+1][j]);
		        }
		    }
		}
		System.out.println(arr[0][0]);
	}
}
