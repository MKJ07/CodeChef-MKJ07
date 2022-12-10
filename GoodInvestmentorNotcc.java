import java.util.*;
/** Code Link:-https://www.codechef.com/DEC221D/problems/INVESTMENT
 * Input:-5
7 4
6 3
2 4
10 10
20 1
Output:-NO YES NO NO YES
 */
public class GoodInvestmentorNotcc {
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if(x>=(2*y)){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
		sc.close();
	}
}