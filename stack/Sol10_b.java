/*10 Stock Span Problem
Stack based approach
O(n) solution and O(1) extra space
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol10_b {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	for(int i=0;i<n;i++){
		a[i] = sc.nextInt();	
	}
	int[] s = new int[n];
	Stack<Integer> st = new Stack<Integer>();
	st.push(0);
	s[0]=1;
	for(int i=1;i<n;i++){
		while(!st.isEmpty() && a[i]>a[st.peek()])
			st.pop();
		s[i]=st.isEmpty()?i+1:i-st.peek();
		st.push(i);
	}
	for(int i=0;i<n;i++)
		System.out.println(s[i]);			


    }
    
}
