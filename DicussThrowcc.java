import java.util.Scanner;

public class DicussThrowcc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a>=b && a>=c){
                System.out.println(a);
            }
            else if(b>=a && b>=c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
        sc.close();
    }
    
}
