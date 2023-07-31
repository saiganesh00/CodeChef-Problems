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
		    int b = sc.nextInt();
		    int area = -1;
		    for(int i = 0; i < n; i++){
		        int height = sc.nextInt();
		        int width = sc.nextInt();
		        int price = sc.nextInt();
		        int tabArea = height * width;
		        if(price <= b){
		            if(tabArea > area){
		                area = tabArea;
		            }
		        }
		    }
		    System.out.println((area == -1)? "no tablet":area);
		}
	}
}
