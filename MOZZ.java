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
		    double x = sc.nextDouble();
		    double y = sc.nextDouble();
		    double r = sc.nextDouble();
		    double totalSticks = x + (r / 30);
		    System.out.println((int)Math.ceil(totalSticks/y));
		}
	}
}
