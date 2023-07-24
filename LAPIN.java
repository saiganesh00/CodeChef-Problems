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
		    String str = sc.next();
		    int n = str.length();
		    char[] leftArr = new char[n/2];
		    char[] rightArr = new char[n/2];
		    for(int i = 0; i < n/2; i++){
		        if(n%2 == 0){
		            leftArr[i] = str.charAt(i);
		            rightArr[i] = str.charAt(i+n/2);
		        }else {
		            leftArr[i] = str.charAt(i);
		            rightArr[i] = str.charAt(i+(n+1)/2);
		        }
		    }
		    Arrays.sort(leftArr);
		    Arrays.sort(rightArr);
		    if(Arrays.equals(leftArr, rightArr)){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
