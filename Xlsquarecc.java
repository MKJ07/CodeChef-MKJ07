import java.util.*;

public class Xlsquarecc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            Double n=sc.nextDouble();
            int a=sc.nextInt();
            int s=(int)Math.sqrt(n)*a;
            System.out.println(s);
        }
        sc.close();
    }
    
}
