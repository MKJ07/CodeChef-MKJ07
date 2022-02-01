import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=0;
        int max=n;
        while(max>=min){
            
            int mid=(max+min)/2;
            if(a[mid]==num){
                System.out.println("Number Succesfully Found");
                break;
            }
            else
            {
                if (a[mid]>num){
                    max=mid-1;
                    
                }
                
                else{
                    min=mid+1;
                }
                System.out.println("Number Not found");
            }
            
           
        }
        sc.close();
        
        
        
    }
    
}
