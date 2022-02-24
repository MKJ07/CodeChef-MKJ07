import java.util.Scanner;

public class mayorpartycc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int p1,p2,p3;
        for(int i=0;i<t;i++){
            p1=sc.nextInt();
            p2=sc.nextInt();
            p3=sc.nextInt();
            if((p1+p3)>p2){
                System.out.println(p1+p3);
            }
            else{
                System.out.println(p2);
            }
        }
        sc.close();
    }
    
}
