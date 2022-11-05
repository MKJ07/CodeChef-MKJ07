import java.util.*;
public class SmallestPossibleWholeNumbercc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int k=sc.nextInt();
            if(x<k){
                System.out.println(x);
            }
            else if((x-k)==0){
                System.out.println(x-k);
            }
            else{
                while((x-k)>=0){
                    x=x-k;
                }
                System.out.println(x);
            }
        }
        sc.close();
    }
}
