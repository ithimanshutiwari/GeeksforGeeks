/*
9.Print all ancestors of a given node
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

class NSol9{

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


	static Node buildTree(int[] inorder,int inL,int inR,int[] postorder, int postL, int postR){
		if(inorder.length!=postorder.length || inorder.length==0)
			return null;
		if(inL>inR || postL>postR)
			return null;
		Node n = new Node(postorder[postR]);
		int i = inL;
		for(;i<=inR;i++){
			if(inorder[i]==n.data)
				break;
		}
		//System.out.println("B "+inL+" "+(i-1)+" "+postL+" "+(postL+i-inL-1));
		n.left = buildTree(inorder,inL,i-1,postorder,postL,postL+i-inL-1);
		//System.out.println("A "+(i+1)+" "+(inR)+" "+(postL+i-inL)+" "+(postR-1));
		n.right= buildTree(inorder,i+1,inR,postorder,postL+i-inL,postR-1);
		return n;
	}

	static boolean allAncestors(Node root, Node temp){
		if(root==null)
			return false;
		if(root==temp)
			return true;

		if(root.left==temp||root.right==temp||allAncestors(root.left,temp)||allAncestors(root.right,temp)){
			System.out.print(root.data+" ");
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
			int[] inorder = {5,2,8,6,1,4,7,3};
			int[] postorder ={5,8,6,2,7,4,3,1};
			Node root = buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1); 


			System.out.println("\nLevel Order : ");
			levelOrder(root);
			System.out.println("\nPreorder : ");
			preOrder(root);
			System.out.println("\nInorder : ");
			inOrder(root);
			System.out.println("\nPostorder : ");
			postOrder(root);
			System.out.println("\n");

			allAncestors(root,root.left.right.left);
			

	}
}
