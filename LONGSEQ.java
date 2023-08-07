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
		    String num = sc.next();
		    int onesCount = 0;
		    for(int i = 0; i < num.length(); i++){
		        if(num.charAt(i) == '1'){
		            onesCount++;
		        }
		    }
		    if((onesCount == num.length() - 1) || (onesCount == 1)){
		        System.out.println("Yes");
		    }else {
		        System.out.println("No");
		    }
		    
		}
	}
}
