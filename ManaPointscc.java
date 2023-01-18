import java.util.*;
/*Question:-Mana Points
Link:-https://www.codechef.com/START74D/problems/MANAPTS
Input: 3
10 30
6 41
50 2

Output: 3 6 0
 */
public class ManaPointscc {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    System.out.println(y/x);
		}
        sc.close();
	}
}
