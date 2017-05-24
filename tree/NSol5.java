/*
5. Level order traversal in reverse
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

class NSol5{


	static void levelOrder(Node root){
		LinkedList<Node> q = new LinkedList<Node>();
		Stack<Node> st = new Stack<Node>();
		q.addLast(root);
		while(q.size()!=0){
			Node n = q.removeFirst();
			System.out.print(n.data+" ");
			if(n.left!=null)
				q.addLast(n.left);
			if(n.right!=null)
				q.addLast(n.right);
			st.push(n);
		}
		while(!st.isEmpty())
			System.out.print(st.pop().data+" ");
	}
	
	public static void main(String[] args){
			Node root1 = new Node(5);
			root1.left = new Node(2);
			root1.right = new Node(-13);
			
			root1.left.left = new Node(1);
			root1.left.right = new Node(-1117);
			
			levelOrder(root1);
	}
}
