import java.util.*;
// Question link:-https://www.codechef.com/problems/WATERCONS
/*input:- 3
2999
1450
2000
output:-YES NO YES */
public class WaterConsumptioncc {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n=sc.nextInt();
	        if(n>=2000){
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	        }
	    }
        sc.close();
		
	}
}
