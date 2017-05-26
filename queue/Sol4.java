/*
4. Find the first circular tour that visits all petrol pumps
http://www.geeksforgeeks.org/find-a-tour-that-visits-all-stations/
*/

import java.util.*;

class Sol4{

	
	public static void main(String[] args){
		
		int[] amount = new int[]{6,3,7};
		int[] distance = new int[]{4,6,3};
		int n =3;
		int start = 0;
		int end = 1;

		int curr = amount[start]-distance[start];
		

		while(end!=start || curr<0){
		
			while(end!=start && curr<0){
				
				curr-=amount[start]-distance[start]; 
				start=(start+1)%n;

				if(start==0)
					break;
				
			}

			curr+=amount[end]-distance[end];
			end=(end+1)%n;
		}

		System.out.println(start);
	}
}