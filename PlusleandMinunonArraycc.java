import java.util.Scanner;

public class PlusleandMinunonArraycc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int a[] =new int[n];
            for(int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }
            int s=0;
            for(int k=0;k<n;k++){
                for(int j=1;j<n;j++){
                    if(k%2==0){
                        s=Math.abs(a[k])+Math.abs(a[j]);
                    }
                    else{
                        s=Math.abs(a[k])-Math.abs(a[j]);
                    }
                }
            }
            System.out.println(s);
        }
        sc.close();
    }
}
