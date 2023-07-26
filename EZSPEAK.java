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
		    String str = sc.next();
		    int consCount = 0, prevCount = 0;
		    String vowels = "aeiouAEIOU";
		    for(int i = 0; i < n; i++){
		        char ch = str.charAt(i);
		        if(!vowels.contains(ch+"")){
		            prevCount += 1;
		        }else {
		            prevCount = 0;
		        }
		        consCount = Math.max(consCount, prevCount);
		    }
		   if(consCount >= 4){
		       System.out.println("NO");
		   }else{
		       System.out.println("YES");
		   }
		}
	}
}
