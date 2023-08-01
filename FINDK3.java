/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    
		    int a1 = y * z;
		    int b1 = x;
		    
		    int a2 = x * z;
		    int b2 = y;
		    
		    int a3 = x * y;
		    int b3 = z;
		    
		    if(a1 % b1 == 0){
		        System.out.println(a1 + " " +b1);
		    }else if(a2 % b2 == 0){
		        System.out.println(a2 + " " + b2);
		    }else if((a3 % b3 == 0)){
		        System.out.println(a3 + " " + b3);
		    }else{
		        System.out.println(-1);
		    }
		}
	}
}
