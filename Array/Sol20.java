/* 20. Two element whose sum is closest to zero
http://www.geeksforgeeks.org/to-find-smallest-and-second-smallest-element-in-an-array/
Time O(n) and space O(1)
*/

import java.util.*;
import java.io.*;

public class Sol20{

	private static int[] findMax (int[] a) {
		int min = 999999;
		for(int i=0; i<a.length; i++) {
			if(min > a[i])
				min = a[i] ;
		}
		int second = 999999;
		for(int i=0; i<a.length; i++) {
			if(a[i]!=min && second > a[i])
				second = a[i] ;
		}
		return new int[]{min,second};
	}

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

		int[] answer = findMax(a);
		System.out.println(answer[0]+" "+answer[1]);	
		
		
	
	}
}
		

				
