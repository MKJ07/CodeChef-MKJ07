import java.util.Scanner;

public class automorphicnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=n*n;
        int d=s%10;
        System.out.println(d);
        sc.close();

    }
}