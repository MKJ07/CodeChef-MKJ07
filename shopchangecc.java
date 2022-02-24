import java.util.Scanner;

public class shopchangecc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int s=0;
            s=100-x;
            System.out.println(s);
        }
        sc.close();
    }
    
}
