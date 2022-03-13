import java.util.Scanner;

public class AkashandMissingcc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int d=n%7;
            if(d>=6){

                System.out.println((n/7)+1);
            }
            else{
                System.out.println(n/7);
            }
        }
        sc.close();

    }
    
}
