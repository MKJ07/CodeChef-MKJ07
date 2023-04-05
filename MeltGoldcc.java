import java.util.Scanner;
/*Question: Melt Gold
Input: 3
3 2
5 3
10 5

Output: 1 2 3
 */
public class MeltGoldcc {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    for(int j=0;j<x;j++){
		        y+=j;
		        if(y>=x){
		            System.out.println(j);
		            break;
		        }
		    }
		}
        sc.close();
	}
}
