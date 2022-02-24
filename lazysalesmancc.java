import java.util.Arrays;

import java.util.Scanner;

public class lazysalesmancc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int w=sc.nextInt();
            int a[]=new int[n];
            for(int k=0;k<n;k++){
                a[k]=sc.nextInt();
            }
          
            Arrays.sort(a);
            int s=0;int j;int count=0;
            for(j=n-1;j>=0;j--){
                s=s+a[j];
                if(s>=w){
                    break;
                    
                }
                else{
                    count++;
                }
            }
            System.out.println(n-count-1);
        }
        sc.close();
    }
    
}
