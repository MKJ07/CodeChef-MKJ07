import java.util.Scanner;

public class Num239 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int c=0;
            while(l++<=r){
                if(l%10==2 || l%10==3 || l%10==9){
                    c++;
                }
            }
            System.out.println(c);

        }
        sc.close();
    }
    
}
