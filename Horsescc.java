import java.util.Arrays;
import java.util.Scanner;

public class Horsescc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[n];
        while(t-->0){

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int min=a[1]-a[0];
            for(int i=1;i<n;i++){
                int sub=a[i]-a[i-1];
                if(sub<=min){
                    min=sub;
                }
            }
            System.out.println(min);
        }
        sc.close();
    }
    
}
