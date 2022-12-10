/*Code Link:-https://www.codechef.com/problems/ATM2
Input:-2

5 10

3 5 3 2 1

4 6

10 8 6 4

Output:- 11010 0010*/

import java.util.*;

import java.lang.*;

import java.io.*;

class Codechef

{


	public static void main (String[] args)	{



        Scanner sc=new Scanner (System.in);

        int t=sc.nextInt();

        for(int i=0;i<t;i++){

            int n=sc.nextInt ();

            int k=sc.nextInt ();

            int[] arr=new int[n];

            for(int j=0;j<n;j++){

                arr[j]=sc.nextInt();

            }

            String s="";

            for(int m=0;m<arr.length;m++){

                if(k<arr[m]){

                    s+="0";

                }

                else{

                    k=k-arr[m];

                    s+="1";

                }

            }

            System.out.println(s);

        }

	}

}
