/*
14. 
Calculate Size of a tree
http://www.geeksforgeeks.org/write-a-c-program-to-calculate-size-of-a-tree/
Time O(n)
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

class Sol14{

	public static int NN(Node root){
		if(root==null)
			return 0;
		else if(root.left==null || root.right==null)
			return 1;
		else
			return 1+NN(root.left)+NN(root.right);
	}
	
	public static void main(String[] args){
			Node root = new Node(1);
			root.left = new Node(2);
			root.right = new Node(3);
			root.left.left = new Node(4);
			root.left.right = new Node(5);
			System.out.println(NN(root));
			
	}
}
