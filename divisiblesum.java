import java.util.*;
public class divisiblesum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int sum=0,count=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            {
                sum=a[i]+a[j];
                if(sum%k==0){
                    count+=1;
                }
            }

        }
        System.out.println(count);
        sc.close();
    }
    
}
