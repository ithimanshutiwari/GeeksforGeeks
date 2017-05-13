/* 10. Median of two sorted arrays
Time & Space Complexity   O(log(n)) & O(1) 
*/

import java.util.*;
import java.io.*;

public class Sol10{

	static int findMedian(int[] a, int low1, int high1, int[] b, int low2, int high2){
		int n1=high1-low1+1;
		int n2=high2-low2+1;
		int x = a[low1+n1/2];
		int y = b[low2+n2/2]; 

		/*
		System.out.println(x+" "+y);
		

		System.out.println("A");
		
		
		for(int i=low1; i<=high1; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("B");
		for(int i=low2; i<=high2; i++){
			System.out.print(b[i]+" ");
		}
		System.out.println();
		*/		
				
		if(n1<=2 || n2<=2){
			int[] c =new int[n1+n2];
			int z = 0;
			for(int i=low1;i<=high1;i++){
				c[z++]=a[i];
				//System.out.println(c[z++]);
				
			}
			for(int i=low2;i<=high2;i++){
				c[z]=b[i];
				//System.out.println(c[z++]);
			}
			Arrays.sort(c);
			/*			
			for(int i=0; i<=n1+n2-1; i++){
				System.out.print(c[i]+" ");
			}
			*/
			return c[(n1+n2)/2];
		}		
		if(x == y)
			return x;
		else if (x<y)
			return findMedian(a,n1/2,high1, b,low2,n2/2);
		else
			return findMedian(a,low1,n1/2, b,n2/2,high2);
			 			
	}

	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		
		// First Array		
		int n1   = sc.nextInt();
		int[] a = new int[n1+1];
		for(int i=0; i<n1; i++){
			a[i] = sc.nextInt();
		}

		//Second Array
		int n2   = sc.nextInt();
		int[] b = new int[n2+1];
		for(int i=0; i<n2; i++){
			b[i] = sc.nextInt();
		}

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
	
		System.out.println(findMedian(a,0,n1-1,b,0,n2-1));
	
	}
}
		

				
