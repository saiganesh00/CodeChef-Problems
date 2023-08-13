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
		    int n = 100;
		    int M = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int[] arr = new int[M];
		    for(int i = 0; i < M; i++){
		        arr[i] = sc.nextInt();
		    }
		    int safeHouses = 0;
		    for(int i = 1; i <= n; i++){
		        boolean isSafe = true;
		        for(int j = 0; j < M; j++){
		            int distance = Math.abs(i - arr[j]);
		            if(distance <= x * y){
		                isSafe = false;
		                break;
		            }
		        }
		        if(isSafe){
		          safeHouses++;
		        }
		    }
		    System.out.println(safeHouses);
		}
	}
}
