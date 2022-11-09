import java.util.*;
public class Problemsinyourto_dolistcc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int ct=0;
            for(int j=0;j<n;j++){
                arr[i]=sc.nextInt();
                if(arr[i]>=1000){
                    ct++;
                }
            }
            System.out.println(ct);
        }
        sc.close();
    }
    
}
