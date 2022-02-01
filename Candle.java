import java.util.*;

public class Candle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int candles[]=new int[n];
        for(int i=0;i<n;i++){
            candles[i]=sc.nextInt();
        }
        Arrays.sort(candles);
        int last=candles[n-1];
        for(int i=0;i<n;i++){
            if(candles[i]==last){
                count++;
            }else{
                continue;
            }
        }
        System.out.println(count);
        sc.close();
    }
    
}
