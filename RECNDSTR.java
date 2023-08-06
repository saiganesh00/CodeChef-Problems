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
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    String str = sc.next();
		    if(str.length() == 1){
		        System.out.println("YES");
		    }else{
		        String left = str.substring(1, str.length()) + str.charAt(0);
		        String right = str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
		        if(left.equals(right)){
		            System.out.println("YES");
		        }else{
		            System.out.println("NO");
		        }
		    }
		}
	}
}
