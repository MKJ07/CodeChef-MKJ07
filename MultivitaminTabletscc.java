import java.util.*;
/*Question:-MultivitaminTablet
 *Link:-https://www.codechef.com/START73D/problems/TABLETS
Input: 4
1 10
12 0
10 29
10 30
Output: YES NO NO YES
*/
public class MultivitaminTabletscc {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if((x*3)<=y){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
        sc.close();
	}
}
