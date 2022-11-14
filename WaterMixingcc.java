import java.util.*;
/*input:- 4
24 25 2 0
37 37 2 9
30 20 10 9
30 31 0 20
output:- YES YES NO NO
*/
public class WaterMixingcc {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(a==b){
                System.out.println("YES");
            }
            else if(a>b){
                    a-=y;
                    if(a<=b)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
            }
            else if(a<b){
                    a+=x;
                    if(a>=b)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
            }
            else
                System.out.println("NO");
            
        }
        sc.close();
    }
    
}