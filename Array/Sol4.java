/* 4.Majority Element
Time Complexity   O(n)
Space Complexity  O(n)
Approach : - Using HashMap
*/

import java.util.*;
import java.io.*;

public class Sol4{

	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		
		// Taking Array Size		
		int n   = sc.nextInt();
		int[] a = new int[n];
		

		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();		
	
		//Inserting element into array in O(1)
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			if(map.containsKey(a[i]))
				map.put(a[i],map.get(a[i])+1);
			else
				map.put(a[i],1);
			
		}

		System.out.println("\n**Initial Array**");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n");

		
		System.out.print("Solving the problem.");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".\n\n");


		int flag=0;
		for(int c:map.keySet()){
			if(map.get(c)>n/2){
				System.out.println("Majority Element "+c);
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Sorry!! No Element in majority");
		
	}
}
		

				