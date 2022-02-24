import java.util.*;

public class Atmcc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        if(x%5==0 && (x+.50)<=y){
            double s=(double)y-(x+0.50);
            System.out.println(String.format("%.2f", s));
        }
        else{
            System.out.println(String.format("%.2f", y));
        }
        sc.close();

    }
    
}
