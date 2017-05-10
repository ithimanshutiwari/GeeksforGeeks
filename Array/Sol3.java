// 3.Given an array A[] and a number x, check for pair in A[] with sum as x
import java.util.*;
import java.io.*;

public class Sol3{

	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		int max = 99999;
		int[] b = new int[max];
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
		
		//Optimized O(n) Solution
		int x = sc.nextInt();
		System.out.print("Solving the problem.");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".\n\n");

		
		int flag=1;
		for(int i=0;i<n;i++){
			if((x-a[i])>=0 && (b[x-a[i]]==1)){
				flag=0;				
				System.out.println(a[i]+","+(x-a[i]));
			}
			b[a[i]]=1;
		}
		if(flag==1)
			System.out.println("Whoops!!! No Solution");
	}
}
		

				
