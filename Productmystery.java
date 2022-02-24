import java.util.Scanner;


public class Productmystery {
    static int egcd(int a, int b) {
        if (a == 0)
            return b;
    
        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
    
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a=0;
        for(int i=0;i<t;i++){
            int b=sc.nextInt();
            int c=sc.nextInt();
            a=c/(egcd(b,c));
            System.out.println(a);
        }
        sc.close();
    }
    
}


