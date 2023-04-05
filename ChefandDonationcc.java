import java.util.*;
/*Question: Chef and Donation
Input : 4
1 3
2 5
4 5
2 10

Output : 2 3 1 8
 */
public class ChefandDonationcc {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
		for (int i=0;i<t;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    System.out.println(y-x);
		} 
        sc.close();
	}
}
