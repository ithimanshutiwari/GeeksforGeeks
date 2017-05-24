/*
6. Delete the deepest node
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

class NSol6{


	static void levelOrder(Node root){
		LinkedList<Node> q = new LinkedList<Node>();
		Node n = null;
		q.addLast(root);
		while(q.size()!=0){
			n = q.removeFirst();
			System.out.print(n.data+" ");
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
			levelOrder(root1);
	}
}
