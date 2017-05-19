// 1. Introduction to Stack
import java.util.*;
class Sol1{
	
	private static int maxSize = 0;
	static int[] stack;
	private static int top = -1;
			
	static void create(int n){
		maxSize = n;
		top=-1;
		stack = new int[maxSize];
	}
	
	static void push(int x){
		if(top==maxSize-1)
			System.out.println("Can't Insert:FULL\n");
		else
			stack[++top]=x;
	}
	static void pop(){
		if(top==-1)
			System.out.println("Can't Delete:Empty\n");
		else
			System.out.println("\nDeleted Element is\t"+stack[top--]);
	}
	static void peek(){
		if(top==-1)
			System.out.println("Empty\n");
		else
			System.out.println("\nElement at top\t"+stack[top]);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		while(true){
			System.out.println("Input your choice\n");
			System.out.println("1.Create\n");
			System.out.println("2.Push\n");
			System.out.println("3.Pop\n");
			System.out.println("4.Peek\n");
			int n = sc.nextInt();


			switch(n){
				case 1:
					System.out.println("\nEnter size of stack\t");
					int size = sc.nextInt();
					create(size);
					break;
				case 2:
					System.out.println("\nInput Element\t");
					int x = sc.nextInt();
					push(x);
					break;
				case 3:
					pop();
					break;
				case 4:
					peek();
					break;				
		
			}
			System.out.println("\nWant to continue(yes(Y) or no(N))\t");
			String s = sc.next();
			if(s.charAt(0)=='N')
				break;		
		}
	}
}
		