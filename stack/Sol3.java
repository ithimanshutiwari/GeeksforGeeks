// Uses Sol2 for Infix to Postfix and added method evaluate postfix using stack in O(n)
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static int eval(String s){
		//System.out.println(s);
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				st.push(Character.digit(s.charAt(i),10));			
			}
			else{
				if(s.charAt(i)=='+'){
					int x = (int)st.pop();
					int y = (int)st.pop();
					st.push(y+x);				
				}
				else if(s.charAt(i)=='-'){
					int x = (int)st.pop();
					int y = (int)st.pop();
					st.push(y-x);				
				}
				else if(s.charAt(i)=='*'){
					int x = (int)st.pop();
					int y = (int)st.pop();
					st.push(y*x);				
				}
				else if(s.charAt(i)=='/'){
					int x = (int)st.pop();
					int y = (int)st.pop();
					st.push(y/x);				
				}
				else if(s.charAt(i)=='^'){
					int x = (int)st.pop();
					int y = (int)st.pop();
					st.push((int)Math.pow(y,x));				
				}			
			}		
		}
		return (int)st.peek();
	}	

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('(',0);
        map.put('+',1);
        map.put('-',1);
        map.put('*',2);
        map.put('/',2);
        map.put('^',3);
        Stack st = new Stack();
        while(n-->0){
            String s = sc.next();
	    String t = "";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(')
                    st.push('(');
                else if(s.charAt(i)=='^')
                    st.push('^');
                else if(s.charAt(i)=='+'||s.charAt(i)=='-' ||s.charAt(i)=='*'||s.charAt(i)=='/'){
                    if(st.isEmpty() ||(int)map.get(s.charAt(i))>(int)map.get((char)st.peek()))
                       st.push(s.charAt(i));
                    else{
                        while(!st.isEmpty() && (int)map.get(s.charAt(i))<=(int)map.get((char)st.peek())){
                            char x = (char)st.pop();
                            if(x=='(')
                                continue;
                            else
                                t+=x;
                        }
                        st.push(s.charAt(i));
                    }
                     
                }
                else if(s.charAt(i)==')'){
                    while((char)st.peek()!='(')
                        t+=(char)st.pop();
                    st.pop();
                                        
                }
                else
                    t+=s.charAt(i);
                
                //System.out.println("\n***"+st.peek()+"***");
                    
            }
            if(!st.isEmpty()){
                while(!st.isEmpty()){
                            char x = (char)st.pop();
                            if(x=='(')
                                continue;
                            else
                                t+=x;
                }
                
            }
            System.out.println(eval(t));
       }
    }
}