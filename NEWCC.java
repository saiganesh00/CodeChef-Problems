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
		int oldVal = sc.nextInt();
		int newVal = sc.nextInt();
		if(oldVal < newVal){
		    System.out.println("Old");
		}else if(newVal < oldVal){
		    System.out.println("New");
		}else{
		    System.out.println("Same");
		}
	}
}
