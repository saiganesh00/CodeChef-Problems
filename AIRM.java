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
		    HashMap<Integer, Integer> hm = new HashMap<>();
		    for(int i = 0; i < n; i++){
		        int num = sc.nextInt();
		        hm.put(num, hm.getOrDefault(num, 0)+1);
		    }
		    for(int i = 0; i < n; i++){
		       int num = sc.nextInt();
		       hm.put(num, hm.getOrDefault(num, 0)+1);
		    }
		    int max = Integer.MIN_VALUE;
		    for(Map.Entry e: hm.entrySet()){
		        if((int)e.getValue() > max){
		            max = (int)e.getValue();
		        }
		    }
		    System.out.println(max);
		}
		
	}
}
