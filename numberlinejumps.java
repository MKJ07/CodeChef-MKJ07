import java.util.*;
public class numberlinejumps {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 == x2) {
            return "YES";
        }
        int diff = v1 > v2 ? v1 - v2 : v2 - v1;
        if (diff == 0) {
            return "NO";
        }
        
        int xdiff = x1 - x2;
        int vdiff = v2 - v1;
        
        if ((xdiff < 0 && vdiff < 0) || (xdiff > 0 && vdiff > 0)) {
            int mod = xdiff % vdiff;
            int mod2 = vdiff % xdiff;
            if (mod == 0 || mod2 == 0) {
                return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
        sc.close();
    }
}















// public class numberlinejumps{
//     public static boolean verify(int x1,int v1,int x2,int v2){

//         if((x1>x2 && v1>v2) || (x2>x1 && v2>v1) && (((x1+v1)%(x2+v2))!=0) || (((x2+v2)%(x1+v1))!=0)){
//             return false;
//         }else{
           
//             return true;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();
//         int y=sc.nextInt();
//         int z=sc.nextInt();
//         int w=sc.nextInt();
        
//         if(verify(x,y,z,w)==true){
//             System.out.println("YES");
//         }else{
//             System.out.println("NO");
//         }
        
//         sc.close();
//     }
        
// }