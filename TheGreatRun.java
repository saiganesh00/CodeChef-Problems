/* 
    Problem
Vishal loves running. He often visits his favourite Nehru Park and runs for very long distances. On one such visit he found that the number of girls in the park was unusually high. Now he wants to use this as an opportunity to impress a large number of girls with his awesome speed.

The track on which he runs is an 
N
N kilometres long straight path. There are 
�
�
a 
i
​
  girls standing within the 
ith
ith kilometre of this path. A girl will be impressed only if Vishal is running at his maximum speed when he passes by her. But he can run at his best speed only for a single continuous stretch of 
K
K kilometres. Now Vishal wants to know what is the maximum number of girls that he can impress.

###Input First line of the input contains the number of testcases 
T
T.

For each test case,

First line contains two space-separated integers 
N
N and 
K
K, the length of the track and the maximum distance he can run at his best speed.

Second line contains N space-separated integers, the number of girls within each kilometre of the track.

###Output For each test case print one line containing an integer, denoting the maximum number of girls Vishal can impress.

###Constraints 
1
≤
T
≤
10
1≤T≤10

1
≤
K
≤
N

*/

/* package codechef; // don't place package name! */

import java.util.*;

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
		    int k = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0; i < n; i++){
		        arr[i] = sc.nextInt();
		    }
		    int j = 0;
		    int prevSum = 0;
		    int maxSum = 0;
		    int count = k;
		    for(int i = j; i < n; i++){
		        prevSum += arr[i];
		        count -= 1;
		        if(count == 0){
		            i = j;
		            j++;
		            if(maxSum < prevSum){
		                maxSum = prevSum;
		            }
		            prevSum = 0;
		            count = k;
		        }
		    }
		    System.out.println(maxSum);
		}
        sc.close();
	}
}

