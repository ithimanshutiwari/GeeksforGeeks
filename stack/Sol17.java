/*
17. Find maximum of minimum for every window size in a given array
http://www.geeksforgeeks.org/find-the-maximum-of-minimums-for-every-window-size-in-a-given-array/

Naive Approach
Time O(n^3) and O(n) space
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol17 {
	

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	
	int[] a = new int[]{10,20,30,50,10,70,30};
	ArrayList<Integer> list = new ArrayList<Integer>();	
	ArrayList<Integer> list2 = new ArrayList<Integer>();	

	for(int i=1;i<=a.length;i++){
		for(int j=0;j<=a.length-i;j++){
			for(int k=0;k<i;k++){
				list.add(a[j+k]);
			}
			list2.add(Collections.min(list));
			list.clear();
		}
		System.out.println(Collections.max(list2));
		list2.clear();
	}
   }
    
}
