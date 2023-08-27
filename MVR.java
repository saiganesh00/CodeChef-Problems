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
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int messi = (a * 2) + (b * 1);
		int ronal = (x * 2) + (y * 1);
		if(messi > ronal){
		    System.out.println("Messi");
		}else if(ronal > messi){
		    System.out.println("Ronaldo");
		}else{
		    System.out.println("Equal");
		}
	}
}
