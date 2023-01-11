import java.util.*;
/*Question:-Lucky Number
 *Link:-https://www.codechef.com/START73D/problems/LUCKYN
Input: 4
6
478
2090
77777
Output: NO YES NO YES
*/
public class LuckyNumberscc {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    int f=0;
		    while(x>0){
		        int d=x%10;
		        if(d==7){
		            f=1;
		            break;
		        }
		        x/=10;
		        
		    }
		    if(f==1)
		        System.out.println("Yes");
		    else    
		        System.out.println("NO");
		}
        sc.close();
	}
}
