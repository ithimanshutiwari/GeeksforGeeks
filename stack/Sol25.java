/*
25. The Celebrity Problem
http://www.geeksforgeeks.org/the-celebrity-problem/
Time O(n) and O(n) space
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol25{
	
	static int a[][] ={{0, 0, 1, 0},
                      {0, 0, 1, 0},
                      {0, 0, 0, 0},
                      {0, 0, 1, 0}};

    //some black box function that we don't know
    static boolean Known(int i,int j){
    	return a[i][j]==1?true:false;
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = 4;
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<n;i++){
			st.push(i);
		}
		while(st.size()!=1){
			int x = st.pop();
			int y = st.pop();
			if(Known(x,y))
				st.push(y);
			else
				st.push(x);
		}
		System.out.println(st.peek());
	
	
   }
    
}
