/* 12. Program for array rotation
Time & Space Complexity   O(n) & O(1) 
*/

import java.util.*;
import java.io.*;

public class Sol12{

	static int gcd(int a, int b){
		if(b==0)
			return a;
		return gcd(b,a%b);	
	}

	static void arrayRotate(int[] a,int d){
		int n = a.length;		
		int x = gcd(n,d);	
		for(int i=0;i<x;i++){
			int temp = a[i];
			int j=i;
			while(j<n){
				a[j]=a[(j+x)%n];
				//System.out.println(j+" "+a[j]);	
				j=j+x;
			
			}
			a[(j-x)%n]=temp;
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
		

				
