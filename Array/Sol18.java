/* 18. Count Inversions in an array
O(nlogn) time and O(n) space
*/

import java.util.*;
import java.io.*;

public class Sol18{


	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		
		// First Array		
		int n   = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

	

		System.out.println("\n**First Array**");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n");

		
		System.out.println(countInversion(a,0,a.length-1));

		
		
		
	
	}
}
		

				
