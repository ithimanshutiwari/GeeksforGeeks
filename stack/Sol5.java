//5. Implement two stacks in an array
// O(n) time and )(n) auxiliary space
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol5{
	protected static int top1=-1;
	protected static int maxSize=5;
	protected static int top2=maxSize;
	protected static int[] a = new int[maxSize];
	
	static void push1(int x){
		if(top2-top1<=1)
			System.out.println("FULL");
		else
			a[++top1]=x;
	}
	static void push2(int x){
		if(top2-top1<=1)
			System.out.println("FULL");
		else
			a[--top2]=x;
	}
	static void pop1(){
		if(top1==-1)
			System.out.println("EMPTY");
		else
			System.out.println(a[top1--]);
	}	
	static void pop2(){
		if(top2==maxSize)
			System.out.println("EMPTY");
		else
			System.out.println(a[top2++]);
	}
	static void peek1(){
		if(top1==-1)
			System.out.println("EMPTY");
		else
			System.out.println(a[top1]);
	}	
	static void peek2(){
		if(top2==maxSize)
			System.out.println("EMPTY");
		else
			System.out.println(a[top2]);
	}	
	

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
		push1(5);
	  	push2(10);
	    	push2(15);
	    	push1(11);
	    	push2(7);
		pop1();
		push2(40);
		pop2();
		
    	}
}	

