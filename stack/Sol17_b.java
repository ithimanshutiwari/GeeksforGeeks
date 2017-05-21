/*
17. Find maximum of minimum for every window size in a given array
http://www.geeksforgeeks.org/find-the-maximum-of-minimums-for-every-window-size-in-a-given-array/

Efficient Approach
Time O(n) and O(n) space
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol17_b {
	
	//O(n) for nextSmaller
	static int[] nextSmaller(int[] a){
		int[] b = new int[a.length];
		Stack<Integer> st = new Stack<Integer>();
		st.push(0);
		for(int i=1;i<a.length;i++){
			if(a[i]>a[st.peek()])
				st.push(i);
			else{
				while(!st.isEmpty() && a[st.peek()]>a[i])
					b[st.pop()]=i;
				st.push(i);			
			}
		}
		while(!st.isEmpty())
			b[st.pop()]=a.length;

		return b;
	}

	static int[] prevSmaller(int[] a){
		int[] b = new int[a.length];
		for(int i=0;i<b.length;i++)
			b[i]=-1;
		Stack<Integer> st = new Stack<Integer>();
		st.push(0);
		b[0]=-1;
		for(int i=1;i<a.length;i++){
			while(!st.isEmpty() && a[st.peek()]>=a[i])
				st.pop();
			if(!st.isEmpty())
				b[i]=st.peek();
			st.push(i);
		}
		return b;
	}
			

			

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	
	int[] a = new int[]{10,20,30,50,10,70,30};
	int[] right=nextSmaller(a);
	int[] left=prevSmaller(a);	

	int[] last = new int[a.length+1];
	for(int i=0;i<a.length;i++){
		int len = right[i]-left[i]-1;
		last[len]=Math.max(last[len],a[i]);
	}
	for(int i=a.length-1;i>=1;i--){
		last[i]=Math.max(last[i],last[i+1]);
	}
	for(int i=1;i<=a.length;i++){
		System.out.println(last[i]);
	}
			
   }
    
}
