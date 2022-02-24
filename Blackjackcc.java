import java.util.Scanner;

public class Blackjackcc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            for(int j=1;j<=10;j++){
                if((n1+n2+j)==21){
                    System.out.println(j);
                    break;
                }
                else if(j>=10 && (n1+n2+j)!=21){
                    System.out.println(-1);
                }

            }
            
        }
        sc.close();
    }
    
}
