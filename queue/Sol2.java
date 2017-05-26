/*
2. Queue using Stack
http://www.geeksforgeeks.org/?p=5009
*/

import java.util.*;

class Sol2{
	static Stack<Integer> st1 = new Stack<Integer>();
	static Stack<Integer> st2 = new Stack<Integer>();
	
	static void enqueue(int item){
		st1.push(item);
	}
	
	static int dequeue(){

		if(!st2.isEmpty()){
			return st2.pop();
		}
		else{
			while(!st1.isEmpty())
				st2.push(st1.pop());
			return st2.pop();
		}
	}

	static int peek(){

		if(!st2.isEmpty()){
			return st2.peek();
		}
		else{
			while(!st1.isEmpty())
				st2.push(st1.pop());
			return st2.peek();
		}	
	}


	public static void main(String[] args){
		enqueue(5);
		enqueue(50);
		
		System.out.println(peek());
		
		System.out.println(dequeue());
		System.out.println(dequeue());
		enqueue(4);
		System.out.println(peek());
					
	}
}