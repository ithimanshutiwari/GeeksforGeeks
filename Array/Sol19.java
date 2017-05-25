/* 19. Two element whose sum is closest to zero
http://www.geeksforgeeks.org/two-elements-whose-sum-is-closest-to-zero/
Time O(nlogn) and space O(1)
*/

import java.util.*;
import java.io.*;

public class Sol19{


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

		Arrays.sort(a);
		int sum=0,min=Integer.MAX_VALUE;
		int l= 0, r=a.length-1;
		while(l<r){
			sum+=a[l]+a[r];
			if(sum<0)
				l++;
			else
				r--;
			if(Math.abs(min)>Math.abs(sum))
				min=sum;
		}
		System.out.println(min);		
		
		
	
	}
}
		

				
