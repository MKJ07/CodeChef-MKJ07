import java.util.Scanner;

public class Bombthebasecc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            int c=0;
            for(int j=0;j<n;j++){
                a[j]=sc.nextInt();
                if(a[j]<x){
                    c=j+1;
                }
            }
            System.out.println(c);
            
        }
        sc.close();
    }
    
}
