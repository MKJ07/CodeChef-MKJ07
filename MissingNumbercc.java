import java.util.Scanner;

public class MissingNumbercc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int b=sc.nextInt();
            int d=sc.nextInt();
            for(i=2;i<=10000;i++){
                int s=b/i;
                if((i+s)==d){
                    System.out.println(s+" "+i);
                    break;
                }
                else{
                    System.out.println(-1+" "+-1);
                    break;
                }
            }
        }
        sc.close();
    }
    
}
