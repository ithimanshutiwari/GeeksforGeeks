/* 9. Merge an array of size n into another array of size m+n
Time & Space Complexity   O(m+n) & O(m+n) 
*/

import java.util.*;
import java.io.*;

public class Sol9{

	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		
		// First Array		
		int n1   = sc.nextInt();
		int[] a = new int[n1+1];
		for(int i=0; i<n1; i++){
			a[i] = sc.nextInt();
		}
		a[n1] = 999999999;

		//Second Array
		int n2   = sc.nextInt();
		int[] b = new int[n2+1];
		for(int i=0; i<n2; i++){
			b[i] = sc.nextInt();
		}
		b[n2] = 999999999;


		System.out.println("\n**First Array**");
		for(int i=0;i<n1;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n");

		
		System.out.println("\n**Second Array**");
		for(int i=0;i<n2;i++)
			System.out.print(b[i]+" ");
		System.out.println("\n");

		System.out.print("Solving the problem.");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".\n\n");
	
		//Problem Logic
		int[] ab = new int[n1+n2];
		int x=0,y=0;		
		for(int i=0;i<n1+n2;i++){
			if(a[x]<b[y]){
				ab[i]=a[x];
				x++;
			}
			else{
				ab[i]=b[y];
				y++;
			}
		}

		System.out.println("\n**Final Array**");
		for(int i=0;i<n1+n2;i++)
			System.out.print(ab[i]+" ");
		System.out.println("\n");
	
	}
}
		

				