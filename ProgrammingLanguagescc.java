import java.util.*;
/*input:- 3
1 2 2 1 3 4
3 4 2 1 4 3
1 2 1 3 2 4
Output:
1 2 0*/
public class ProgrammingLanguagescc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        for(int i=0;i<n;i++){
            int c=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int a1=sc.nextInt();
            int b1=sc.nextInt();
            int a2=sc.nextInt();
            int b2=sc.nextInt();
            if((a==a1 && b==b1) || (a==b1 && b==a1)){
                c++;
            }
            if((a==a2 && b==b2) || (a==b2 && b==a2)){
                c+=2;
            }
            System.out.println(c);
            
        }
        sc.close();
    }
}
