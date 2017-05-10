// 1.Search, insert and delete in an unsorted array

import java.util.*;
import java.io.*;

public class Sol1{

	static int search(int a[], int element, int n){
		for(int i=0; i<n; i++){
			if(a[i] == element){
				System.out.println("Element "+element+" Found at index "+i+"\n");
				return i;
			}
		}
		System.out.println("Not Found\n");		
		return -1;
		
	}

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		// Taking Array Size		
		int n   = sc.nextInt();
		int[] a = new int[n];
		
		//Inserting element into array in O(1)
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		System.out.println("\n**Initial Array**");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n");

		//Serach - In wrost case O(n)
		int element = sc.nextInt();
		search(a,element,n);
		
		//Deletion - In wrost case(Search+Shifting) O(n)+O(n)=O(n)
		int num = sc.nextInt();
		int index = search(a,num,n);
		if(index==-1)
			System.out.println("Element is not present so can't be deleted\n");
		else{
			
			for(int i=index;i<n-1;i++){
				a[i]=a[i+1];
			}
			n=n-1;
			
			//Array after deletion
			System.out.println("\n**Final Array**");
			for(int i=0;i<n;i++)
				System.out.print(a[i]+" ");
			System.out.println("\n");

		}
	}
}
		

				
