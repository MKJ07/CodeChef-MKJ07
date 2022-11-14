import java.util.Scanner;
/*input:- 4
9 9
15 7
10 19
21 20
ouput:-NO YES NO YES */
 class printnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
    
}
