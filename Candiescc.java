import java.util.*;
public class Candiescc {
    public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int s=sc.nextInt();
		    int[] arr=new int[2*s];
            for(int a=0;a<arr.length;a++){
                arr[a]=sc.nextInt();
            }
		    int f=0;
		    int c;
		    for(int j=0;j<arr.length-1;j++){
		        c=0;
		        for(int k=1;k<arr.length;k++){
		            if(arr[j]==arr[k]){
		                c++;
		            }
		        }
		        if(c>=1){
		            f=1;
		        }
		    }
		    if(f==0){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
        sc.close();
	}
}
