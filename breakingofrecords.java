import java.util.*;
public class breakingofrecords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        int high=0,low=0;
        int h=a[0];
        int l=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>h){
                high++;
                h=a[i];

            }else if(a[i]<l){
                low++;
                l=a[i];

            }else{
                continue;
            }
            
        }
        System.out.println(high+" "+low);
        sc.close();
    }
    
}
