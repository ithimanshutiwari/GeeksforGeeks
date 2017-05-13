/* 11. Write a program to reverse an array or string
Time & Space Complexity   O(n) & O(1) 
*/

import java.util.*;
import java.io.*;

public class Sol11{

	static void reverse(int[] a,int low, int high){
		if(low>high)
			return ;		
		int temp = a[low];
		a[low]=a[high];
		a[high]=temp;
		reverse(a,low+1,high-1);
		
			
	}
	

	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		
		// First Array		
		int n1   = sc.nextInt();
		int[] a = new int[n1+1];
		for(int i=0; i<n1; i++){
			a[i] = sc.nextInt();
		}

	

		System.out.println("\n**First Array**");
		for(int i=0;i<n1;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n");

		
		System.out.print("Solving the problem.");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".\n\n");
	
		reverse(a,0,n1-1);

		
		System.out.println("\n**Final Array**");
		for(int i=0;i<n1;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n");

		
	
	}
}
		

				
