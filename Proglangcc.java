/* code link:-https://www.codechef.com/problems/PROGLANG
input:- 3

1 2 2 1 3 4

3 4 2 1 4 3

1 2 1 3 2 4

ouput:- 1 2 0*/

import java.util.*;

import java.lang.*;

import java.io.*;



class Codechef

{

 public static void main (String[] args) throws java.lang.Exception

 {

        Scanner sc=new Scanner (System.in);

        int t=sc.nextInt();

        for(int i=0;i<t;i++){

            int a=sc.nextInt();

            int b=sc.nextInt();

            int a1=sc.nextInt();

            int b1=sc.nextInt()

            int a2=sc.nextInt();

            int b2=sc.nextInt();

            if((a==a1 && b==b1) || (a==b1 && b==a1)){

                System.out.println(1);

            }

            else if((a==a2 && b==b2) || (a==b2 && b==a2)){

                System.out.println(2);

            }

            else{

                System.out.println(0);

            }

        }

 }

}
