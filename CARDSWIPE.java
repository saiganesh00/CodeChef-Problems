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
		    Map<Integer, Integer> hm = new HashMap<>();
		    int curPeople = 0;
		    int maxPeople = 0;
		    for(int i = 0; i < n; i++){
		        int x = sc.nextInt();
		        hm.put(x, hm.getOrDefault(x, 0)+1);
		        if(hm.get(x) % 2 == 1){
		            curPeople += 1;
		        }else{
		            curPeople -= 1;
		        }
		        maxPeople = Math.max(curPeople, maxPeople);
		    }
		    
		    System.out.println(maxPeople);
		}
	}
}
