/* 
    Problem
    Your task is very simple: given two integers 
    A and B, write a program to add these two numbers and output the sum.

    Input Format
    The first line contains an integer 
    T, the total number of test cases.
    Then follow 
    T lines, each line contains two integers, 
    A and B.
    Output Format
    For each test case, add 
    A and B and display the sum in a new line.


*/



// You don't need to add/edit anything to the below solution. 
// Click on the SUBMIT button to solve your first problem on CodeChef.


import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;



// Remember that the class name should be "Main" in codechef and should be "public".
public class AddTwoNumbers {
	public static void main(String[] args) {
		// System.in and System.out are input and output streams, respectively.
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);

		// Read the number of test casese.		
		int T = in.nextInt();
		while (T-- > 0) {
			// Read the numbers a and b.
			int a = in.nextInt();
			int b = in.nextInt();
			
			// Compute the sum of a and b.
			int ans = a + b;
			System.out.println(ans);
		}
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
				    tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
				    throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}