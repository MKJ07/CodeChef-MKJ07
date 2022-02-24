import java.util.Scanner;

public class guessthebottomcc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int x;
        for(int i=0;i<t;i++){
            x=sc.nextInt();
            int s=0;
            s=7-x;
            System.out.println(s);
        }
        sc.close();

    }
    
}
