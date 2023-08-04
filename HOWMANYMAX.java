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
		    int arr[] = new int[n];
		    String str = sc.next();
		    int len = str.length();
		    int count = 0;
		    if(str.charAt(0) == '1'){
		        count +=1;
		    }
		    if(str.charAt(len-1) == '0'){
		        count += 1;
		    }
		    for(int i = 0; i < len-1; i++){
		        if(str.charAt(i) == '0' && str.charAt(i+1) == '1'){
		            count += 1;
		        }
		    }
		    System.out.println(count);
		}
	}
}
