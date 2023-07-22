/* package codechef; // don't place package name! */

import java.util.*;


/* 
 *  Problem
        The ZCO Scholarship Contest has just finished, and you finish with a rank of 
        �
        R. You know that Rank 
        1
        1 to Rank 
        50
        50 will get 
        100
        %
        100% scholarship on the ZCO exam fee and Rank 
        51
        51 to Rank 
        100
        100 will get 
        50
        %
        50% percentage scholarship on the ZCO exam fee. The rest do not get any scholarship.
        What percentage of scholarship will you get ?

        Input Format
        Input consist of single line of input containing one integer 
        �
        R.
        Output Format
        Output a single line containing one integer — the percentage of scholarship you will get. 
*/

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int rank = sc.nextInt();
		if(rank >= 1 && rank <= 50){
		    System.out.println(100);
		}else if(rank >= 51 && rank <= 100){
		    System.out.println(50);
		}else{
		    System.out.println(0);
		}
        sc.close();
	}
}
