import java.util.Scanner;

public class Polybagcc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int count=0;
            count=n/10;
            if(n%10!=0){
                count=count+1;
            }
            System.out.println(count);

            
        }
        sc.close();
    }
    
}
