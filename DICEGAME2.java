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
		    int[] arr = new int[6];
		    for(int i = 0; i < 6; i++){
		        arr[i] = sc.nextInt();
		    }
		    ArrayList<Integer> alice = new ArrayList<>();
		    for(int i = 0; i < 3; i++){
		        alice.add(arr[i]);
		    }
		    Collections.sort(alice);
		    
		    ArrayList<Integer> bob = new ArrayList<>();
		    for(int i = 3; i < 6; i++){
		        bob.add(arr[i]);
		    }
		    Collections.sort(bob);
		    
		    int aliceScore = alice.get(1) + alice.get(2);
		    int bobScore = bob.get(1) + bob.get(2);
		    if(aliceScore > bobScore){
		        System.out.println("Alice");
		    }else if(bobScore > aliceScore){
		        System.out.println("Bob");
		    }else {
		        System.out.println("Tie");
		    }
		}
	}
}
