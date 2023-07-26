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
		    int main[] = new int[2];
		    int first[] = new int[2];
		    int second[] = new int[2];
		    main[0] = sc.nextInt();
		    main[1] = sc.nextInt();
		    first[0] = sc.nextInt();
		    first[1] = sc.nextInt();
		    second[0] = sc.nextInt();
		    second[1] = sc.nextInt();
		    Arrays.sort(main);
		    Arrays.sort(first);
		    Arrays.sort(second);
		    if(Arrays.equals(main, first)) {
		        System.out.println("1");
		    }else if(Arrays.equals(main, second)) {
		        System.out.println("2");
		    }else {
		        System.out.println("0");
		    }
		}
	}
}
