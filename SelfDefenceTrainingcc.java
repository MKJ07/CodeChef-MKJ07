import java.util.Scanner;

public class SelfDefenceTrainingcc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int c=0;
            for(int j=0;j<n;j++){
                int a=sc.nextInt();
                if(a>=10 && a<=60){
                    c++;
                }
            }
            System.out.println(c);
        }
        sc.close();
    }
    
}
