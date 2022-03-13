import java.util.Scanner;

public class JanmanshandGamescc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            for(int j=0;j<y;j++){
                x++;
            }
            if(x%2==0){
                System.out.println("Janmansh");
            }
            else{
                System.out.println("Jay");
            }
        }
        sc.close();
    }
    
}
