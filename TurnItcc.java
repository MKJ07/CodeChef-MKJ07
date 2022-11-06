import java.util.*;
/*input:- 3
1 1 1 1
2 1 1 1
2 2 1 1
output:- Yes No Yes */
public class TurnItcc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int u=sc.nextInt();
            double v=sc.nextDouble();
            int a=sc.nextInt();
            int s=sc.nextInt();
            double d=Math.sqrt((u*u)+(2*a*s))-1;
            if(d<=v){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }  
        }
        sc.close();
    }
}
