import java.util.Scanner;

class ChefMaskcc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if((x*100)<(y*10)){
                System.out.println("DISPOSABLE");
            }
            else if((x*100)>(y*10)){
                System.out.println("CLOTH");
            }
            else{
                System.out.println("CLOTH");
            }
        }
        sc.close();
    }
}