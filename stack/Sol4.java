//4. (Reverse a string using stack)
// O(n) time and )(n) auxiliary space
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol4{

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	String n = sc.next();
		Stack st =new Stack();
		for(int i=0;i<n.length();i++)
			st.push(n.charAt(i));
		while(!st.isEmpty())
			System.out.print(st.pop());
		System.out.println();
        
    	}
}	

