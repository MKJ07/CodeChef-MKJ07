import java.util.*;
public class RichieRichcc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            int d=(b-a)/x;
            System.out.println(d);
        }
        
        sc.close();
    }
}
