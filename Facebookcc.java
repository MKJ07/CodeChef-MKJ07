import java.util.*;
/*Question:-Facebook
Link:-https://www.codechef.com/START74D/problems/FACEBOOK 
Input: 4
3
5 4 4
1 2 3
3
10 10 9
2 5 4
3
3 3 9
9 1 3
4
2 8 1 5
2 8 1 9

Output: 1 2 3 2*/
public class Facebookcc {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
		for(int j=0;j<t;j++){
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    int[] b=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        b[i]=sc.nextInt();
		    }
		    int max=Integer.MIN_VALUE;
		    int like=Integer.MIN_VALUE;
		    for(int i=0;i<n;i++){
		        if(a[i]>=max){
		            max=a[i];
		        }
		    }
		    for(int i=0;i<n;i++){
		        if(a[i]==max){
		            if(b[i]>like){
		                like=b[i];
		            }
		        }
		    }
		    for(int i=0;i<n;i++){
		        if(b[i]==like){
		            System.out.println(i+1);
		        }
		    }
		}
        sc.close();
	}
}
