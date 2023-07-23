/* 
    You are participating in a contest which has 
11
11 problems (numbered 
1
1 through 
11
11). The first eight problems (i.e. problems 
1
,
2
,
…
,
8
1,2,…,8) are scorable, while the last three problems (
9
9, 
10
10 and 
11
11) are non-scorable ― this means that any submissions you make on any of these problems do not affect your total score.

Your total score is the sum of your best scores for all scorable problems. That is, for each scorable problem, you look at the scores of all submissions you made on that problem and take the maximum of these scores (or 
0
0 if you didn't make any submissions on that problem); the total score is the sum of the maximum scores you took.

You know the results of all submissions you made. Calculate your total score.

Input
The first line of the input contains a single integer 
�
T denoting the number of test cases. The description of 
�
T test cases follows.
The first line of each test case contains a single integer 
�
N denoting the number of submissions you made.
�
N lines follow. For each 
�
i (
1
≤
�
≤
�
1≤i≤N), the 
�
i-th of these lines contains two space-separated integers 
�
�
p 
i
​
  and 
�
�
s 
i
​
 , denoting that your 
�
i-th submission was on problem 
�
�
p 
i
​
  and it received a score 
�
�
s 
i
​
 .
Output
For each test case, print a single line containing one integer ― your total score. 
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
		    HashMap<Integer, Integer> hm = new HashMap<>();
		    for(int i = 0; i < n; i++){
		        int key = sc.nextInt();
		        int val = sc.nextInt();
		        
		        if(hm.containsKey(key)){
		            if((int)hm.get(key) < val){
		                hm.put(key, val);
		            }
		        }else{
		            hm.put(key, val);
		        }
		        
		    }
		    int sum = 0;
		    for(Map.Entry<Integer, Integer> e: hm.entrySet()){
		        if((int)e.getKey() <= 8){
		            sum += (int)e.getValue();
		        }
		    }
		    System.out.println(sum);
		}
        sc.close();
	}
}

