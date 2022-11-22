import java.util.*;
/* code link:-https://www.codechef.com/problems/BIRYANI
input:- 4
1 10
1 15
2 10
2 15
output:-10 15 20 30 */
public class Biryaniclassescc {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    System.out.println(x*y);
		}
	}
}
}
