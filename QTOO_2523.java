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
		    int[] arr = new int[256];
		    int flag = 0;
		    
		    for(int i = 0; i < n; i++){
		        int ch = str.charAt(i);
		        if(arr[ch] == 1){
		            flag = 1;
		            break;
		        }else{
		            arr[ch] = 1;
		        }
		    }
		    if(flag == 0){
		        System.out.println(-1);
		    }else{
		        System.out.println(n-2);
		    }
		}
	}
}
