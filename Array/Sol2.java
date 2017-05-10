// 2.Search, insert and delete in a sorted array

import java.util.*;
import java.io.*;

public class Sol2{

	static int binary_search(int a[], int element, int low,int high){
		
		if(low>high){
			System.out.println("Not Found");
			return -1;		
		}
		int mid = (low+high)/2;
		if(a[mid] == element){
			System.out.println("Element "+element+" Found at index "+mid+"\n");
			return mid;
		}
		else if(a[mid]>element)
			return binary_search(a,element,low,mid-1);
		else
			return binary_search(a,element,mid+1,high);
		
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

		//Serach - In wrost case O(log n)
		int element = sc.nextInt();
		binary_search(a,element,0,n);
		
		//Deletion - In wrost case(Search+Shifting) O(log n)+O(n)=O(n)
		int num = sc.nextInt();
		int index = binary_search(a,num,0,n);
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
		

				
