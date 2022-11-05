import java.util.*;
/*input:- 3
50
172
201
output:-Easy
Medium
Hard
 */
public class ProblemCategorycc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x>=1 && x<100){
                System.out.println("Easy");
            }
            else if(x>=100 && x<200){
                System.out.println("Medium");
            }
            else{
                System.out.println("Hard");
            }
        }
        sc.close();
    }
    
}
