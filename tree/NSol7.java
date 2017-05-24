/*
7. Building a tree from Inorder and preorder traversal
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

class NSol7{

	static void levelOrder(Node root){
		LinkedList<Node> q = new LinkedList<Node>();
		q.addLast(root);
		while(q.size()!=0){
			Node n = q.removeFirst();
			System.out.print(n.data+" ");
			if(n.left!=null)
				q.addLast(n.left);
			if(n.right!=null)
				q.addLast(n.right);
		}
	}

	static void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}


	static void preOrder(Node root){
		if(root!=null){
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}


	static void postOrder(Node root){
		if(root!=null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
			
		}
	}


	static Node buildTree(int[] inorder,int inL,int inR,int[] preorder, int preL, int preR){
		if(inorder.length!=preorder.length || inorder.length==0)
			return null;
		if(inL>inR || preL>preR)
			return null;
		Node n = new Node(preorder[preL]);
		int i = inL;
		for(;i<=inR;i++){
			if(inorder[i]==n.data)
				break;
		}
		n.left = buildTree(inorder,inL,i-1,preorder,preL+1,preL+i-inL);
		n.right= buildTree(inorder,i+1,inR,preorder,preL+i-inL+1,preR);
		return n;
	}
	
	public static void main(String[] args){
			int[] inorder = {5,2,8,6,1,4,7,3};
			int[] preorder = {1,2,5,6,8,3,4,7};
			Node root = buildTree(inorder,0,inorder.length-1,preorder,0,preorder.length-1); 
			System.out.println("\nLevel Order : ");
			levelOrder(root);
			System.out.println("\nPreorder : ");
			preOrder(root);
			System.out.println("\nInorder : ");
			inOrder(root);
			System.out.println("\nPostorder : ");
			postOrder(root);
			System.out.println("\n");
			

	}
}
