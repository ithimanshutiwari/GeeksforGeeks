/*
1. Queue Implementation
http://www.geeksforgeeks.org/queue-set-1introduction-and-array-implementation/
*/

import java.util.*;

class Sol1{
	public static void main(String[] args){
		Queue<Integer> q = new LinkedList<Integer>();
		System.out.println(q.offer(15));
		System.out.println(q.offer(7));
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.poll());
	}
}