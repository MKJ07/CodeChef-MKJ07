import java.util.Scanner;

public class Coinscc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=1;
        while (sc.hasNextInt(10)) {
            int n=sc.nextInt();
            int a;
            a=n/2+n/3+n/4;
            if((a)>=n){
                System.out.println(a);
            }
            else{
                System.out.println(n);
            }
            if(t++==10){
                break;
            }
        }
        sc.close();
    }
    
}
