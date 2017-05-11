/* 5. Find the Number Occurring Odd Number of Times
Time Complexity   O(n)
Space Complexity  O(1)
Approach : - Using Bit Manipulation (XOR)
*/

import java.util.*;
import java.io.*;

public class Sol5{

	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		
		// Taking Array Size		
		int n   = sc.nextInt();
		int[] a = new int[n];
		
		
		int x=0;
		//Inserting element into array in O(1)
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			x^=a[i];
		}

		System.out.println("\n**Initial Array**");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n");

		
		System.out.print("Solving the problem.");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".\n\n");

		System.out.println("Unique Element "+x);
		
	}
}
		

				
