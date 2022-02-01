import java.util.*;
public class matrix {
    public static void main(String args[]){
        int l=0;int r=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    l+=a[i][j];
                }
                // if((i+j)==(n-1)) for su,m of diagonal
                if(i==(n-j-1)){
                    r+=a[i][j];
                }
            }
        }
        System.out.println(Math.abs(l-r));

        sc.close();
    }
}

    

