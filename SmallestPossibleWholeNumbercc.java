import java.util.*;
/*input:-3
5 2
4 4
2 5
output:-1 0 2 */
public class SmallestPossibleWholeNumbercc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int k=sc.nextInt();
            if(k==0){
                System.out.println(x);
            }
            else
                System.out.println(x%k);
        }
        sc.close();
    }
}
