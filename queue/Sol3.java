/*
3. Largest multiple of 3
http://www.geeksforgeeks.org/find-the-largest-number-multiple-of-3/
*/

import java.util.*;

class Sol3{

	static void print(Queue<Integer> b,Queue<Integer> c,Queue<Integer> d){
		ArrayList<Integer>  a = new ArrayList<Integer>();
		while(b.size()!=0 ){
			a.add(b.poll());
		}
		while(c.size()!=0 ){
			a.add(c.poll());
		}
		while(d.size()!=0 ){
			a.add(d.poll());
		}
		Collections.sort(a);
		Collections.reverse(a);
		System.out.println(a);
	}
	
	public static void main(String[] args){
		
		int[] a = new int[]{8,7,6,1,0};
		Arrays.sort(a);
		Queue<Integer> b = new LinkedList<Integer>();
		Queue<Integer> c = new LinkedList<Integer>();
		Queue<Integer> d = new LinkedList<Integer>();
		
		int sum = 0;
		for(int i=0;i<a.length;i++){
			if(a[i]%3==0)
				b.offer(a[i]);
			else if(a[i]%3==1)
				c.offer(a[i]);
			else
				d.offer(a[i]);
			sum+=a[i];
		}
		if(sum%3==1){
			if(c.size()>0)
				c.poll();
			else{
				d.poll();
				d.poll();
			}

		}
		else if(sum%3==1){
			if(d.size()>0)
				d.poll();
			else{
				c.poll();
				c.poll();
			}			
		}

		print(b,c,d);

	}
}