/*
2. Find Min element in a binary tree without recursion
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

class NSol2{

	static int min=Integer.MAX_VALUE;

	static void levelOrder(Node root){
		LinkedList<Node> q = new LinkedList<Node>();
		q.addLast(root);
		while(q.size()!=0){
			Node n = q.removeFirst();
			if(min>n.data)
				min=n.data;
			if(n.left!=null)
				q.addLast(n.left);
			if(n.right!=null)
				q.addLast(n.right);
		}
	}
	
	public static void main(String[] args){
			Node root1 = new Node(5);
			root1.left = new Node(2);
			root1.right = new Node(-13);
			
			root1.left.left = new Node(1);
			root1.left.right = new Node(-1117);
			
			levelOrder(root1);
			System.out.println(min);
			
	}
}
