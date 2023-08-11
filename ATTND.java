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
		    String[] firstName = new String[n];
		    String[] lastName = new String[n];
		    HashMap<String, Integer> hm = new HashMap<>();
		    for(int i = 0; i < n; i++){
		        firstName[i] = sc.next();
		        lastName[i] = sc.next();
		        hm.put(firstName[i], hm.getOrDefault(firstName[i], 0)+1);
		    }
		    for(int i = 0; i < n; i++){
		        if(hm.get(firstName[i]) > 1){
		            System.out.println(firstName[i] + " " + lastName[i]);
		        }else{
		            System.out.println(firstName[i]);
		        }
		    }
		    
		}
	}
}
