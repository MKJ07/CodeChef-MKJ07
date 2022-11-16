import java.util.*;
/*input:- 3
2 1
1 1
2 2
output:-Alice Alice Bob */
public class Hackermancc {
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int s=a+b;
            if(isPrime(s)){
                System.out.println("Alice");
            }
            else{
                System.out.println("Bob");
            }
            
        }
        sc.close();
    }
    
}
