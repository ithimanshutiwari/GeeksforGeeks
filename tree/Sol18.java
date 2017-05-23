/*
18.
Convert a Binary Tree into its Mirror Tree
http://www.geeksforgeeks.org/write-an-efficient-c-function-to-convert-a-tree-into-its-mirror-tree/


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

class Sol18{

	public static void mirror(Node root){
		if(root==null)
			return;
		mirror(root.left);
		mirror(root.right);
		Node temp = root.left;
		root.left = root.right;
		root.right=temp;
	}
	static void inorder(Node root){
		if(root!=null){
			
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);

			
		}
	}

	public static void main(String[] args){
			Node root1 = new Node(1);
			root1.left = new Node(2);
			root1.right = new Node(3);
			

			Node root2 = new Node(1);
			root2.left = new Node(2);
			root2.left.left = new Node(4);
			root2.left.right = new Node(5);

			inorder(root2);
			mirror(root2);
			inorder(root2);
	}
}
