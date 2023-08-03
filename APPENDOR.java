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
		    int y = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0; i < n; i++){
		        arr[i] = sc.nextInt();
		    }
		    int res = arr[0];
		    for(int i = 1; i < n; i++){
		        res = res | arr[i];
		    }
		    res = y - res;
		    int ans = res & y;
		    if(ans == res){
		        System.out.println(res);
		    }else{
		        System.out.println(-1);
		    }
		}
	}
}
