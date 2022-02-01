import java.util.*;
public class comparetriplet {
    public static void main(String args[]){
        
        int al=0 ,bo=0;
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        int b[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            
        }
        for(int j=0;j<n;j++){
            b[j]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]>b[i]){
                al+=1; 
     
            }
            else if(a[i]<b[i]){
                bo+=1;
            }
            else{
                continue;
            }
            
        }
        System.out.println(al+" "+bo);
        sc.close();
    }
}
    
