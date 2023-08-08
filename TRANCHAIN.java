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
            int N = sc.nextInt();
            int A_no = 0;
            int B_no = 0;
            int AB_no = 0;
            int O_no = 0;
            for(int i = 0; i<N; i++){
                String str = sc.next();
                if(str.equals("A")) A_no++;
                else if(str.equals("B")) B_no++;
                else if(str.equals("AB")) AB_no++;
                else if(str.equals("O")) O_no++;
                
            }
            int chain = Math.max(A_no,B_no);
            System.out.println(chain + AB_no + O_no);
        }
	}
}
