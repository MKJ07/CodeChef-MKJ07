import java.util.*;
public class Motivationcc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int N=sc.nextInt();
            int x=sc.nextInt();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<N;i++){
                int s=sc.nextInt();
                int r=sc.nextInt();
                if(s<=x && r>max){
                    max=r;
                }
            }
            System.out.println(max);
        }
        sc.close();
    }
}
