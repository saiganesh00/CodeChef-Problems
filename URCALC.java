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
		char ch = sc.next().charAt(0);
		switch(ch){
		    case '+':
		        System.out.println(a + b);
		        break;
		    case '-':
		        System.out.println(a - b);
		        break;
		    case '*':
		        System.out.println(a * b);
		        break;
		    case '/':
		        System.out.println((double)a / b);
		        break;
		}
	}
}
