/* 1. Greedy Algorithms | Set 1 (Activity Selection Problem)
Assuming Already sorted activity by their finish time
O(n) time & O(1) space
*/

import java.util.*;
import java.io.*;

class ActivitySelection{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //Size of start and finish array
	
		//Input activity array
		int[] start = new int[n];
		int[] finish = new int[n];

		for(int i=0;i<2*n;i++){
			if(i<n)
				start[i]=sc.nextInt();
			else
				finish[i-n]=sc.nextInt();
		}
	
		int cnt = 1, j = 0;
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(0);

		for(int i=1;i<n;i++){
			if(start[i]>=finish[j]){
				cnt++;
				list.add(i);
				j++;
			}
		}
		System.out.println("Count :- "+cnt);
		System.out.println("\ngit commitActivities are ...");
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
		System.out.println();	
	}
}
			
