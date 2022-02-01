import java.util.*;
public class subarraydivision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n-m+1;i++){
            int sum=0;
            for(int j=i;j<i+m;j++){
                sum+=a[j];
            }
            if(sum==d){
                count++;
            }else{
                continue;
            }
        }
        System.out.println(count);
        sc.close();
    }
    
}
