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
		Scanner in = new Scanner(System.in);
		int T = in.nextInt(); //for No. of test cases
		for(int i=0;i<T;i++)
		{
		   //Your Code Goes Here
		   int n = in.nextInt(); //the total number of members present in the Parliamen
		   int x = in.nextInt(); // the number of members who voted in favour of the resolution
		   System.out.println(2*x<n?"No":"Yes");
		}
	}
}
