/*8. Reverse a stack using recursion
O(n2) solution and O(1) extra space
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol8 {

    	static void reverse(Stack st){
		if(st.isEmpty())
			return;
		else{

			int x=(int)st.pop();
			reverse(st);
			insert(st,x);	
		}
	}

	static void insert(Stack st, int item){
		if(st.isEmpty())
			st.push(item);
		else{
			int x=(int)st.pop();
			insert(st,item);
			st.push(x);
		}	
	}

    public static void main(String[] args) {
        Stack st=new Stack();
	st.push(1);
	st.push(2);
	st.push(3);
	st.push(4);
	st.push(5);
	
	System.out.println(st.peek());
	reverse(st);
	while(!st.isEmpty())
	System.out.println(st.pop());
    }
    
}