/*Code Link:-https://www.codechef.com/problems/BALLBOX
Input:- 4

3 4

30 3

2 2

1 1
Output:- NO YES NO YES */







import java.util.*;

import java.lang.*;

import java.io.*;



class Codechef

{

	public static void main (String[] args) throws java.lang.Exception	{

		// your code goes here

        Scanner sc=new Scanner (System.in);

        int t=sc.nextInt();

        for(int i=0;i<t;i++){

            int n=sc.nextInt();

            int k=sc.nextInt();

            if(n<k){

                System.out.println("No");

            }

            else if(k%2!=0 && n%k==0){

                System.out.println("Yes");

            }

            else{

                System.out.println("No");

            }

        }

	}

}
