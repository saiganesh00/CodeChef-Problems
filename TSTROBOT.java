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
		    int x = sc.nextInt();
		    String str = sc.next();
		    char[] chArr = str.toCharArray();
		    Set<Integer> set = new HashSet<>();
		    set.add(x);
		    for(int i = 0; i < chArr.length; i++){
		        if(chArr[i] == 'L'){
		            x -= 1;
		        }else{
		            x += 1;
		        }
		        set.add(x);
		    }
		    
		    System.out.println(set.size());
		}
	}
}
