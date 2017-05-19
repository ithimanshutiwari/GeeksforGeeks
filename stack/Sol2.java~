import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('(',0);
        map.put('+',1);
        map.put('-',1);
        map.put('*',2);
        map.put('/',2);
        map.put('^',3);
        Stack st = new Stack();
        while(t-->0){
            String s = sc.next();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(')
                    st.push('(');
                else if(s.charAt(i)=='^')
                    st.push('^');
                else if(s.charAt(i)=='+'||s.charAt(i)=='-' ||s.charAt(i)=='*'||s.charAt(i)=='/'){
                    if(st.isEmpty() ||(int)map.get(s.charAt(i))>(int)map.get((char)st.peek()))
                       st.push(s.charAt(i));
                    else{
                        while(st.isEmpty() && (int)map.get(s.charAt(i))<=(int)map.get((char)st.peek())){
                            char x = (char)st.pop();
                            if(x=='(')
                                continue;
                            else
                                System.out.print(x);
                        }
                        st.push(s.charAt(i));
                    }
                     
                }
                else if(s.charAt(i)==')'){
                    while((char)st.peek()!='(')
                        System.out.print(st.pop());
                    st.pop();
                                        
                }
                else
                    System.out.print(s.charAt(i));
                
                //System.out.println("\n***"+st.peek()+"***");
                    
            }
            if(!st.isEmpty()){
                while(!st.isEmpty()){
                            char x = (char)st.pop();
                            if(x=='(')
                                continue;
                            else
                                System.out.print(x);
                }
                
            }
            System.out.println();
       }
    }
}
