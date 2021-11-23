// Java program to print pattern that first 
// reduces 5 one by one, then adds 5. 
// Without any loop an extra variable. 

import java.io.*; 

class reducedrec { 
	
	// Recursive function to print the 
	// pattern without any extra variable 
	static void printPattern(int n) 
	{ 
		
		// Base case (When n becomes 0 or 
		// negative) 
		if (n == 0 || n < 0) { 
			
			System.out.print(n + " "); 
			
			return; 
		} 

		// First print decreasing order 
		System.out.print(n + " "); 
		
		printPattern(n - 5); 

		// Then print increasing order 
		System.out.print(n + " "); 
	} 

	// Driver Program 
	public static void main(String[] args) 
	{ 
		
		int n = 16; 
		
		printPattern(n); 
	} 
} 

// This code is contributed by vt_m 
