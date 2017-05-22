/*
19. Minimum number of bracket reversals needed to make an expression balanced
http://www.geeksforgeeks.org/minimum-number-of-bracket-reversals-needed-to-make-an-expression-balanced/

Efficient Approach
Time O(n) and O(n) space
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol19 {
	
	static void reversal(String s){
		int m=0,n=0;
		Stack<Character> st =new Stack<Character>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='{'){
				st.push('{');
				m++;
			}
			else{
				if(!st.isEmpty() && st.peek()=='{'){
					st.pop();
					m--;
				}
				else{
					st.push('}');
					n++;
				}
			}
				
		}
		if(s.length()%2==0)
			System.out.println((int)(Math.ceil(m/2.0)+Math.ceil(n/2.0)));
		else
			System.out.println("-1");
			
	}		


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	
	int n = sc.nextInt();
	while(n-->0){
		String s=sc.next();
		reversal(s);		
	}
   }
    
}