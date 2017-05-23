/*
20.Given a binary tree, print out all of its root-to-leaf paths one per line.
http://www.geeksforgeeks.org/given-a-binary-tree-print-out-all-of-its-root-to-leaf-paths-one-per-line/
O(n)
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

class Sol20{

	static int h = 0;

	static void pathFromRoot(Node root, ArrayList<Integer> path){
		if(root==null)
			return;
		path.add(root.data);
		if(root.left==null && root.right==null){
			System.out.println(path);
		}

		pathFromRoot(root.left,path);
		pathFromRoot(root.right,path);


	}
	
	public static void main(String[] args){
			Node root1 = new Node(5);
			root1.left = new Node(2);
			root1.right = new Node(3);
			
			root1.left.left = new Node(1);
			root1.left.right = new Node(1);
			
			
			ArrayList<Integer> path = new ArrayList<Integer>();
			pathFromRoot(root1,path);
			
	}
}
