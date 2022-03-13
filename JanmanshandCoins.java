import java.util.Scanner;

public class JanmanshandCoins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int s=0;
            s=(x*10)+(y*5);
            System.out.println(s);
        }sc.close();
    }
    
}
