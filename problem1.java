import java.util.*;

public class problem1{
    static int mSwap(int arr[], int n){
        int noofone=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                noofone=noofone+1;
            }
        }
            int x=noofone;
            int maxo=Integer.MAX_VALUE;
            int pcom[]=new int[n];
            if(arr[0]==1){
                pcom[0]=1;
            }
        
            for(int i=1;i<n;i++){
                if(arr[i]==1){
                    pcom[i]=pcom[i-1]+1;

                }
                else{
                    pcom[i]=pcom[i-1];
                }

            }
            for(int i=x-1;i<n;i++){
                if(i==(x-1))
                noofone=pcom[i];
                else
                noofone=pcom[i]-pcom[i-x];
                if(maxo<noofone)
                maxo=noofone;
            }
            int noofzero=x-maxo;
            return noofzero;
        }

    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a=s.split("");
        int n=s.length();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=Integer.parseInt(a[i]);

        }
        System.out.println(mSwap(ar, n));
        sc.close();

    }
}