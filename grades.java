import java.util.*;
public class grades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int grade[]=new int[n];
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            grade[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int s=0, one=0;
            s=grade[i]+2;
            one=grade[i]+1;
            if(s%5==0 && s>=40){
                result[i]=s;

            }
            else if(one%5==0 &&s>=40){
                result[i]=one;
                
            }
            else{
                result[i]=s-2;
            }
        }
        System.out.println("here are the nos");
        for(int i=0;i<n;i++){
            System.out.println(result[i]);    
        }
        
        sc.close();
    }
    
}
