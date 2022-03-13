import java.util.Scanner;

public class Qulifyroundcc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int s=0;
            s=(a*1)+(b*2);
            if(s>=x){
                System.out.println("Qualify");
            }
            else{
                System.out.println("NotQualify");
            }

            

        }
        sc.close();
    }
    
}
