

/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		while(t-- > 0) {
		    int num_dolls = scn.nextInt();
		    int type = 0;
		    
		    for(int i = 0; i < num_dolls; ++i)
		        type ^= scn.nextInt();
		  
		    System.out.println(type);
		}
        scn.close();
	}
}

