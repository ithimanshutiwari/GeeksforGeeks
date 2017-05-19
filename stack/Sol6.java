//6. Balanced Parenthesis
// O(n) time 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol6{

	static boolean check(Stack st, char c){
		if(!st.isEmpty()){
            char x = (char)st.peek();
            if(c==')' && x =='('){
                st.pop();
                return true;
            }
            else if (c=='}' && x =='{'){
                st.pop();
                return true;
            }
            else if(c==']' && x =='['){
                st.pop();  	
                return true;
            }
        }
        return false;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int flag=0;
        
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            flag=0;
            Stack st =new Stack();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                    st.push(s.charAt(i));		
                }
                else{
                    if(check(st,s.charAt(i)))
                        continue;
                    else{
                        flag=1;
                        break;
                    }
                }
            }
            if(flag!=1 && st.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

