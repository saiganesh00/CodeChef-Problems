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
		    int k = sc.nextInt();
		    int v = sc.nextInt();
		    int[] arr = new int[n];
		    int sum = 0;
		    for(int i = 0; i <n; i++){
		        arr[i] = sc.nextInt();
		        sum += arr[i];
		    }
		    int res = (((k+n)*v) - sum)/k;
		    if(res <= 0){
		        System.out.println(-1);
		    }else{
		        int checkDecimal = (((k+n)*v) - sum)%k;
		        if(checkDecimal == 0){
		            System.out.println(res);
		        }else{
		            System.out.println(-1);
		        }
		    }
		}
	}
}
