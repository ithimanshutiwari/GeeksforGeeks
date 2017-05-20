/*
2. Pair with given product | Set 1 (Find if any pair exists): http://www.geeksforgeeks.org/pair-with-given-product-set-1-find-if-any-pair-exists/
Time O(n) and O(1) space
*/

import java.util.*;
public class Sol2{
	static boolean findPair(int[] arr, int x){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();		
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0 && map.containsKey(x/arr[i]))
				return true;
			map.put(arr[i],1);		
		}
		return false;	
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[]{0,20,9,40};
		int x = 0;
		System.out.println(findPair(arr,x));
	}
}
				
