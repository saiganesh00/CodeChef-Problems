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
		    for(int i = 0; i < n; i++){
		        arr[i] = sc.nextInt();
		    }
		    HashMap<Integer, Integer> hm = new HashMap<>();
		    for(int i: arr){
		        hm.put(i, hm.getOrDefault(i, 0)+1);
		    }
		    int maxCount = 0;
		    for(Map.Entry e: hm.entrySet()){
		        int count = 0;
		        if((int)e.getValue() != 1){
		            count = (int)e.getValue();
		        }else {
		            count = 1;
		        }
		        if(maxCount < count){
		            maxCount = count;
		        }
		    }
		    System.out.println(n - maxCount);
		}
	}
}
