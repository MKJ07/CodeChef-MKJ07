import java.util.Scanner;

public class plusminusLT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a[]=new int[num];
        for(int i=0;i<num;i++){
            a[i]=sc.nextInt();

        }
        int t=sc.nextInt();
        
        for(int i=0;i<num;i++){

            for(int j=i+1;j<num;j++){
                if((a[i]+a[j])==t){
                    System.out.println(i+","+j);
                }
            }
        }

        sc.close();
    }
    
}
