import java.util.Scanner;

public class ChefRacescc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int cnt=0;
            if((x!=a && x!=b) && (y!=a && y!=b) ){
                cnt+=2;
            }
            else if((x!=a && x!=b) || (y!=a && y!=b)){
                cnt++;
            }
        
            System.out.println(cnt);
        }
        sc.close();
    }
    
}
