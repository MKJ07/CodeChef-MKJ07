import java.util.*;
/*Code Link:-https://www.codechef.com/problems/URCALC?tab=statement
Input
8
2
/
Output : 4.0
 */
public class ProgramYourOwnCALCULATORcc {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		char c = sc.next().charAt(0);
		if(c=='+')
		    System.out.println(a+b);
		else if(c=='-')
		    System.out.println(a-b);
		else if(c=='*')
		    System.out.println(a*b);
		else if(c=='/')
		    System.out.println((1.0*a)/b);
		 
	}
}
