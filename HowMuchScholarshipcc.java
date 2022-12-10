/* Code Link:- https://www.codechef.com/problems/ZCOSCH
   Input:- 49 317
   Output:-100 0*/

import java.util.*;

import java.lang.*;

import java.io.*;



class Codechef

{

	public static void main (String[] args) throws java.lang.Exception	{

		Scanner sc=new Scanner(System.in);

		int r =sc.nextInt();

		if(r>0 && r<51){

		    System.out.println(100);

		}

		else if(r>=51 && r<=100){

		    System.out.println(50);

		}

		else{

		    System.out.println(0);

		}

	}

}
