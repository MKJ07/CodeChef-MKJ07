import java.util.Scanner;
public class fc
{	
	public static void main(String[] args)
	{
		//scanner class declaration
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");				
		int number = sc.nextInt();
		int fac,sum = 0;
		int n = number;
		while(n != 0)
		{	
			fac = 1;
			int r = n % 10;
			//calculating factorial of r
			for(int i = r ; i >= 1 ; i--)
			fac = fac * i;
            sum = sum + fac;
            n=n/10;
		}
        System.out.println(fac);
        sc.close();
		
	}
}
