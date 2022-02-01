import java.util.*;
public class migratorybirds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
    
}
