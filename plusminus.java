import java.util.*;

public class plusminus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int p = 0, n1 = 0, z = 0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0) {
                p += 1;
            } else if (arr[i] < 0) {
                n1 += 0;
            } else {
                z += 1;
            }
        }
        float a=0f,b=0f,c=0f;
        a = (float)p/n;
        b = (float)n1/n;
        c = (float)z/n;
        System.out.printf("%.6f \n",a);
        System.out.printf("%.6f \n",b);
        System.out.printf("%.6f",c);
        sc.close();

    }
}