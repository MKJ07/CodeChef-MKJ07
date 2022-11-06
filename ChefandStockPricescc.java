import java.util.*;
/*input:- 3
100 93 108 7
100 94 100 -7
183 152 172 -17
output:- Yes No No */
public class ChefandStockPricescc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            Double s=sc.nextDouble();
            Double a=sc.nextDouble();
            Double b=sc.nextDouble();
            Double c=sc.nextDouble();
            Double d=s+((s*c)/100);
            if(d>=a && d<=b){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        sc.close();
    }
    
}
