import java.util.Scanner;

class creditscodechef{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];
        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++){
            if(a[i]>65){
                System.out.println("Overload");
            }
            else if(a[i]<35){
                System.out.println("Underload");
            }
            else{
                System.out.println("Normal");
            }
        }
        sc.close();
}
}
