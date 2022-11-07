import java.util.*;
/*input:- 3
3
4
5
output:- 3 4 4 */
public class MaximumLengthEvenSubarraycc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int sum = 0;
            int d = 0;
            for (int j = 1; j <= u; j++) {
                d += j;
                sum++;
                if (j == u && d % 2 != 0) {
                    sum -= 1;
                }

            }
            System.out.println(sum);

        }

        sc.close();
    }
}
