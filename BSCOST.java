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
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    String str = sc.next();
		    int ones = 0;
		    int zeroes = 0;
		    for(int i = 0; i < n; i++){
		        char ch = str.charAt(i);
		        if(ch == '1'){
		            ones++;
		        }else{
		            zeroes++;
		        }
		    }
		    if(ones == 0 || zeroes == 0){
		        System.out.println(0);
		    }else{
		        System.out.println(x > y ? y : x);
		    }
		}
	}
}
