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
		Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-- > 0){
            int n=scan.nextInt();
            int x=0;
            while( (x*(x+1))/2 < n){
                x++;
            }
            if((x*(x+1))/2 == n) 
                System.out.println(x);
            else 
                System.out.println(x-1);
        }
	}
}
