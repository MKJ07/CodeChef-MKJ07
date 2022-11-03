import java.util.*;
public class TheTwoDishescc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int N=sc.nextInt();
            int s=sc.nextInt();
            int max=Integer.MIN_VALUE;
            for(int j=0;j<=Math.min(s, N);j++){
                int d=(s-j);
                if(d+j==s){
                    if(d<=N)
                        d=d-j;
                    else
                        continue;
                }
                if(d>max){
                    max=d;
                }
                
            }
            System.out.println(max);
        }
        sc.close();
    }
    
}
