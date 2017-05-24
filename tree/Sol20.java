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

	public static void print(Node root){
		int[] path=new int[256];
		printPath(root,path,0);
	}
	static void printPath(Node root, int[] path, int pathLen){
		if(root==null)
			return;
		path[pathLen++]=root.data;
		if(root.left==null && root.right==null){
			printArray(path,pathLen);
		}

		printPath(root.left,path,pathLen);
		printPath(root.right,path,pathLen);

	}
	static void printArray(int[] a, int l){
		for(int i=0;i<l;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
			Node root1 = new Node(5);
			root1.left = new Node(2);
			root1.right = new Node(13);
			
			root1.left.left = new Node(51);
			root1.left.right = new Node(1);
			
			
			print(root1);
			
	}
}
