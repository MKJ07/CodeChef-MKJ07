import java.util.*;
/*Elections in Chefland
Input : 4
4 3
5 3 1 2
3 2
1 3 4
4 2
2 1 2 4
5 6
1 2 3 4 5

Output :2 2 3 0 
 */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int arr[]=new int[n];
		    int c=0;
		    for(int j=0;j<n;j++){
		        arr[j]=sc.nextInt();
		        if(arr[j]>=x){
		            c++;
		        }
		    }
		    System.out.println(c);
		    
		}
        sc.close();
		
	}
}
