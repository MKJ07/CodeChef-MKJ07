import java.util.Scanner;

class table{
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        for(int i=1;i<=n;i++){

            
            System.out.println(t+"*"+n+"="+ t*i);
        }
        sc.close();
    }
}