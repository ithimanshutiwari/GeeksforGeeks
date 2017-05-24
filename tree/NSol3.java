/*
3. Search an element in a binary tree
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

class NSol3{

	static boolean search(Node root,int item){
		if(root==null)
			return false;
		if(root.data==item)
			return true;
		return search(root.left,item)||search(root.right,item);

	}
	
	public static void main(String[] args){
			Node root1 = new Node(5);
			root1.left = new Node(2);
			root1.right = new Node(-13);
			
			root1.left.left = new Node(1);
			root1.left.right = new Node(-1117);
			
			System.out.println(search(root1,2));
			
	}
}
