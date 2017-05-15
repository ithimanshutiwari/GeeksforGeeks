/* 15. Maximum sum such that no two elements are adjacent
Time & Space Complexity   O(n) & O(1) 
*/

import java.util.*;
import java.io.*;

public class Sol15{

		
	static void arrayRotate(int[] a,int d){
		reverse(a,0,d-1);
		reverse(a,d,a.length-1);
		reverse(a,0,a.length-1);
			
	}
	
	static void reverse(int arr[], int start, int end)
	{
	    int temp;
	    while (start < end)
	    {
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
	    }
	}

	

	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		
		// First Array		
		int n1   = sc.nextInt();
		int[] a = new int[n1];
		for(int i=0; i<n1; i++){
			a[i] = sc.nextInt();
		}
		int d = sc.nextInt();

	

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
	
		arrayRotate(a,d);

		
		System.out.println("\n**Final Array**");
		for(int i=0;i<n1;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n");

		
	
	}
}
		

				
