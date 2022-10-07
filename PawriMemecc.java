import java.util.Scanner;

public class PawriMemecc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s=sc.nextLine();
            s=s.toLowerCase();
            String r="";
            for(int j=0;j+4<s.length();j++){
                if(s.substring(j, j+4)=="party"){
                    String sub=s.substring(j, j+4);
                    r=s.replace(sub, "pawri");
                }
            }
            System.out.println(r);
        }
        sc.close();
    }
    
}
