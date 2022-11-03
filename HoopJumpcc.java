import java.util.*;
/*
input : 2 1 3
output: 1 2 
*/
public class HoopJumpcc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int h=sc.nextInt();
            System.out.println((h/2)+1);
            
        }
        sc.close();
    }
}
