import java.util.*;
public class Practicemakesusperfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        int ct=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=10){
                ct++;
            }
        }
        System.out.println(ct);
        sc.close();
    }
}
