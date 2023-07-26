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
		    int[] A = new int[n];
		    int[] B = new int[n];
		    for(int i = 0; i < n; i++){
		        A[i] = sc.nextInt();
		    }
		    for(int i = 0; i < n; i++){
		        B[i] = sc.nextInt();
		    }
		    int addyMax = 0, omMax = 0;
		    int curMax = 0;
		    for(int i = 0; i < n; i++){
		        if(A[i] != 0){
		            curMax += 1;
		        }else{
		            curMax = 0;
		        }
		        omMax = Math.max(omMax, curMax);
		    }
		    curMax = 0;
		    for(int i = 0; i < n; i++){
		        if(B[i] != 0){
		            curMax += 1;
		        }else {
		            curMax = 0;
		        }
		        addyMax = Math.max(addyMax, curMax);
		    }
		    if(addyMax > omMax){
		        System.out.println("ADDY");
		    }else if(addyMax == omMax){
		        System.out.println("DRAW");
		    }else if(omMax > addyMax){
		        System.out.println("OM");
		    }
		}
	}
}
