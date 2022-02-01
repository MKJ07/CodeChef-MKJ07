import java.util.*;
public class apple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int apple[]=new int[m];
        int orange[]=new int[n];
        int count1=0,count2=0;
        for(int i=0;i<m;i++){
            apple[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            orange[j]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            int dist=0;
            dist=a+apple[i];
            if(dist>=s && dist<=t){
                count1++;
            }else{
                continue;
            } 
        }
        for(int j=0;j<n;j++){
            int dist=0;
            dist=b+orange[j];
            if(dist>=s && dist<=t){
                count2++;
            }else{
                continue;
            }
        }
        System.out.println(count1+"\n"+count2);
        sc.close();
    }
    
}
