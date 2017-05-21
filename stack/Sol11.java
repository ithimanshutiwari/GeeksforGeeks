/*
11.Design and Implement Special Stack Data Structure | Added Space Optimized Version
http://www.geeksforgeeks.org/design-and-implement-special-stack-data-structure/
Time O(1) for each operation and O(n) space
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol11 {

	static Stack<Integer> a = new Stack<Integer>();
    	static Stack<Integer> b = new Stack<Integer>();	

	static void pushS(int x){
		a.push(x);
		if(b.isEmpty())
			b.push(x);
		else{
			if(b.peek()>=x)
				b.push(x);			
		}	
	}
	
	static void popS(){
		int x = a.pop();
		if(!b.isEmpty() && x==b.peek())
			b.pop();
		System.out.println("DEL "+x);	
	}
	
	static void isEmptyS(){
		System.out.println(a.isEmpty());
	}
	static void getMinS(){
		if(!b.isEmpty())
			System.out.println(b.peek());	
		else
			System.out.println(-1);
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	
	pushS(10);
	pushS(20);
	pushS(30);
	getMinS();
	pushS(5);
	getMinS();

    }
    
}