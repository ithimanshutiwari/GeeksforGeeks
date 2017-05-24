/*
14. Finding an element in BST
worst case O(n) time and O(n) recusion calls
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

class NSol14{

	static Node search(Node root,int item){
		if(root==null)
			return root;
		if(root.data==item)
			return root;
		else if(root.data>item)
			return search(root.left,item);
		return search(root.right,item); 
	}
	
	public static void main(String[] args){
		Node root = new Node(7);
		root.left = new Node(4);
		root.right = new Node(9);

		root.left.left = new Node(2);
		root.left.right = new Node(5);

		System.out.println(search(root,5)!=null);
	}
	
}