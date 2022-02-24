import java.util.Arrays;
import java.util.Scanner;

public class cuttingofstick {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a[]=new int[num];
        for(int i=0;i<num;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(num);
        for(int i=1;i<num;i++){
            if(a[i]!=a[i-1]){
                System.out.println(num-i);
            }
        }
        sc.close();
    }
    
}
