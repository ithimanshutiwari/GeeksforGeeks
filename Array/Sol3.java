// 3.Given an array A[] and a number x, check for pair in A[] with sum as x
import java.util.*;
import java.io.*;

public class Sol3{

	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		
		// Taking Array Size		
		int n   = sc.nextInt();
		int[] a = new int[n];
		
		//Inserting element into array
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		System.out.println("\n**Initial Array**");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n");
		
		//Brute Force Approach
		int x = sc.nextInt();
		System.out.print("Solving the problem.");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".\n\n");

		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]+a[j]==x)
					System.out.println(a[i]+","+a[j]);
			}
		}
	}
}
		

				
