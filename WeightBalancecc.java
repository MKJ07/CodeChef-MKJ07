import java.util.*;
/*input:-5
1 2 1 2 2
2 4 1 2 2
4 8 1 2 2
5 8 1 2 2
1 100 1 2 2
output:-0
1
1
1
0  */
public class WeightBalancecc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int w1=sc.nextInt();
            int w2=sc.nextInt();
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int m=sc.nextInt();
            int min=x1*m;
            int max=x2*m;
            if((w2-w1)>=min && (w2-w1)<=max){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
            
        }
        sc.close();
    }
}
