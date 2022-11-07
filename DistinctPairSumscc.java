import java.util.Scanner;

public class DistinctPairSumscc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int sum=l,c=0;
            for(int j=l;j<=r;j++){
                sum+=j;
                c++;
            }
            System.out.println(c);
        }
        sc.close();
    }
}
