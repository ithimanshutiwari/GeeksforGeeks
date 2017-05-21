/*
16. Length of the longest valid substring of parenthesis
http://www.geeksforgeeks.org/length-of-the-longest-valid-substring/Time O(2^n) and O(1) space
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol16 {
	

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	
	String s = sc.next();
	Stack<Character> st = new Stack<Character>();
	int cnt=0;	
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)=='(')
			st.push('(');
		else{
			while(!st.isEmpty() && st.peek()=='('){
				st.pop();
				cnt++;
				break;
			}	
		}	
	}
	System.out.println(2*cnt);
    }
    
}
