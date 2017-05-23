/*
9. Level Order Tree Traversal 
http://www.geeksforgeeks.org/level-order-tree-traversal/
AND
10. Print level order traversal line by line
http://www.geeksforgeeks.org/print-level-order-traversal-line-line/
Time Complexity O(n) where n is no of node
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

class Sol9{

	public static void levelOrder(Node root){
		LinkedList<Node> q = new LinkedList<Node>();

		q.addLast(root);

		while(true){
			int nodeCount = q.size();
			if(q.size()==0)
				break;
			
			while(nodeCount>0){
				Node n = q.removeFirst();
				System.out.print(n.data+" ");
				if(n.left!=null)
					q.addLast(n.left);
				if(n.right!=null)
					q.addLast(n.right);
				nodeCount--;
			}
			System.out.println();
		}

		//IF want to print in a single line
		/*
		LinkedList<Node> q = new LinkedList<Node>();
		q.addLast(root);
		while(q.size()!=0){
			Node n = q.removeFirst();
			System.out.print(n.data);
			if(n.left!=null)
				q.addLast(n.left);
			if(n.right!=null)
				q.addLast(n.right);
		}
		*/






	}
	
	public static void main(String[] args){
			Node root = new Node(1);
			root.left = new Node(2);
			root.right = new Node(3);
			root.left.left = new Node(4);
			root.left.right = new Node(5);
			levelOrder(root);
			
	}
}
