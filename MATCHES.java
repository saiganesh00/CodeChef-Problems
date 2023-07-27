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
		    int num1 = sc.nextInt();
		    int num2 = sc.nextInt();
		    int sum = num1 + num2;
		    int digits[] = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		    int totalMatches = 0;
		    while(sum > 0){
		        int lastDigit = sum % 10;
		        totalMatches += digits[lastDigit];
		        sum = sum / 10;
		    }
		    System.out.println(totalMatches);
		}
	}
}
