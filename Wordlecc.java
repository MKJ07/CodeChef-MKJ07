import java.util.Scanner;

public class Wordlecc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s=sc.nextLine();
            String a=sc.nextLine();
            String m="";
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==a.charAt(j)){
                    m+='G';
                }
                else{
                    m+='B';
                }
            }
            System.out.println(m);
            
            

        }
        sc.close();
    }
}