/* 16.  Leaders in an array
http://www.geeksforgeeks.org/leaders-in-an-array/
O(n) time and O(n) space
*/

import java.util.*;
import java.io.*;

public class Sol16{


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

		
		Stack<Integer> st = new Stack<Integer>();
		st.push(a[0]);
		for(int i=1;i<n;i++){
			while(!st.isEmpty() && st.peek()<a[i])
				st.pop();
			st.push(a[i]);
		}

		
		System.out.println("\n**Leaders**");
		while(!st.isEmpty())
			System.out.print(st.pop()+" ");
		System.out.println("\n");

		
	
	}
}
		

				
