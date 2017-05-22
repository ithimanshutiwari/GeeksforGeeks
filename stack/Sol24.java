/*
24. Largest Rectangular Area in a Histogram
http://www.geeksforgeeks.org/largest-rectangle-under-histogram/
Efficient Approach
Time O(n) and O(n) space
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol24{
	
	static int[] nextSmaller(int[] a){
		int[] b = new int[a.length];
		for(int i=0;i<a.length;i++){
			b[i]=a.length;
		}
		
		Stack<Integer> st = new Stack<Integer>();
		st.push(0);
		for(int i=1;i<a.length;i++){
			if(!st.isEmpty() && a[i]<a[st.peek()]){			
				while(!st.isEmpty() && a[i]<a[st.peek()]){
		                	b[st.pop()]=i;
					
				}
				st.push(i);
			}
			else
				st.push(i);
		}
		
		return b;
	}

	static int[] prevSmaller(int[] a){
		int[] b = new int[a.length];
		for(int i=0;i<a.length;i++){
			b[i]=-1;
		}
		
		Stack<Integer> st = new Stack<Integer>();
		for(int i=a.length-1;i>=0;i--){
			if(!st.isEmpty() && a[i]<a[st.peek()]){			
				while(!st.isEmpty() && a[i]<a[st.peek()]){
		                	b[st.pop()]=i;
					
				}
				st.push(i);
			}
			else
				st.push(i);
		}
		
		return b;
	}		
	

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-->0){
		int n = sc.nextInt();
		int[] a = new int[n];
		int j = 0;
		while(n-->0){
			a[j++]=sc.nextInt();		
		}

		int[] right = new int[a.length];
		int[] left = new int[a.length];
	
		right=nextSmaller(a);
		left = prevSmaller(a);	
	
		int max=-1;
		for(int i=0;i<a.length;i++){
			int len = right[i]-left[i]-1;
			if(max<a[i]*len)
				max=a[i]*len;
		}	
		System.out.println(max);
	}
	
	
   }
    
}
