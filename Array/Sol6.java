/* 6. Largest Sum Contiguous Subarray
Time Complexity   O(n)
Space Complexity  O(1)
Approach : - Using Kadane's Algorithm
*/

import java.util.*;
import java.io.*;

public class Sol6{

	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		
		// Taking Array Size		
		int n   = sc.nextInt();
		int[] a = new int[n];
		int max=-999999;

		//Inserting element into array in O(1)
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			if(max<a[i])
				max=a[i];
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
	
		//Logic
		int max_sf=0;
		int max_eh=0;
		
		for(int i=0;i<n;i++){
			max_eh+=a[i];
			if(max_eh<0)
				max_eh=0;
			if(max_sf<max_eh)
				max_sf=max_eh;			
					
		}

		//For all negative values
		if(max<0)
			System.out.println(max);
		else
			System.out.println(max_sf);
		
	}
}
		

				
