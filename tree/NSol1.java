/*
1. Find Max element in a binary tree
O(n) time and O(n) space
*/
import java.util.*;

class Node{
	int data;
	Node left,right;

	public Node(int item){
		data=item;
		left=null;
		right=null;
	}

}

class NSol1{

	static int findMax(Node root){
		if(root==null)
			return -1;
		else{
			int a = findMax(root.left);
			int b = findMax(root.right);
			if(a>b && a>root.data)
				return a;
			else if(b>a && b>root.data)
				return b;
			else
				return root.data;
		}
	}
	
	public static void main(String[] args){
			Node root1 = new Node(5);
			root1.left = new Node(2);
			root1.right = new Node(3);
			
			root1.left.left = new Node(1);
			root1.left.right = new Node(7);
			
			
			System.out.println(findMax(root1));
			
	}
}
