/*9. Sort a stack using recursion
O(n^2) solution and O(1) extra space
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol9 {

    	static void sort(Stack<Integer> st){
		if(st.isEmpty())
			return;
		else{

			int x=st.pop();
			sort(st);
			insert(st,x);	
		}
	}

	static void insert(Stack<Integer> st, int item){
		if(st.isEmpty()|| item>st.peek())
			st.push(item);
		else{
			int x=st.pop();
			insert(st,item);
			st.push(x);
		}	
	}

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<Integer>();
	st.push(12);
	st.push(2);
	st.push(31);
	st.push(40);
	st.push(5);
	
	System.out.println(st.peek());
	sort(st);
	while(!st.isEmpty())
	System.out.println(st.pop());
    }
    
}
