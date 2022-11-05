import java.util.*;
/**input:- 2
4 2 8
10 14 18

output:-12
32
 */
public class ChefandSpellscc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int max=a+b;
            if((a+c)>max){
                max=a+c;
            }
            if((b+c)>max){
                max=b+c;
            }
            System.out.println(max);
        }
        sc.close();
    }
}