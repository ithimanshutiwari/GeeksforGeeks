/* 7. Find the Missing Number
Time & Space Complexity   O(n) & O(1)   Sum Formula
Time & Space Complexity   O(n) & O(1)   XOR
*/

import java.util.*;
import java.io.*;

public class Sol7{

	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		
		// Taking Array Size		
		int n   = sc.nextInt();
		int[] a = new int[n];

		//Inserting element into array in O(1)
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
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
	
		//First Logic
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=a[i];		
		}
		System.out.println("Using SUM formula");
		System.out.println(((n+1)*(n+2)/2)-sum);
		System.out.println();


		//Second Logic
		int x=0,y=0;
		for(int i=0;i<n;i++)
			x^=a[i];
		for(int i=1;i<=n+1;i++)
			y^=i;
		System.out.println("Using XOR");
		System.out.println(x^y);
		System.out.println();	
	}
}
		

				
