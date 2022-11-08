import java.util.*;
public class TwoDishescc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int ct=0,n1=n;
            while(n1-->0){
                if(a>0 && b>0){
                    a--;b--;ct++;
                }
                if(b>0 && c>0){
                    b--;c--;ct++;
                }
            }
            if(ct>=n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        sc.close();
        
    }
    
}
