import java.util.Scanner;

public class Tyreproblemcc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int s=0;
            s=(n*2)+(m*4);
            System.out.println(s);
        }
        sc.close();
    }
    
}
