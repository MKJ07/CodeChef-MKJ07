import java.util.*;
public class VaccineDatecc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            if(d<l){
                System.out.println("Too Early");
            }
            else if(d>r){
                System.out.println("Too Late");
            }
            else{
                System.out.println("Take second dose now");
            }
        }
        sc.close();
    }
    
}
