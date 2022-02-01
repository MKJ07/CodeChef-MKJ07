// sum of arrays
import java.util.*;

public class bigsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a[] = new long[5];
        long min = 0, max = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        for (int i = 0; i < 4; i++) {
            min += a[i];
        }
        for (int i = 1; i < 5; i++) {
            max += a[i];
        }
        System.out.println(min + " " + max);
        sc.close();
    }

}
