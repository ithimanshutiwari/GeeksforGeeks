/*
10.LCA of 2 nodes
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

class NSol10{


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

	
	static Node lca(Node root,Node a,Node b){
		if(root==null)
			return null;
		if(root==a || root==b)
			return root;
		Node left=lca(root.left,a,b);
		Node right = lca(root.right,a,b);
		if(left!=null && right!=null)
			return root;
		return left==null?right:left;

	}
	
	public static void main(String[] args){
			int[] inorder = {5,2,8,6,1,4,7,3};
			int[] postorder ={5,8,6,2,7,4,3,1};
			Node root = buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1); 

			System.out.println("\nPreorder : ");
			preOrder(root);
			System.out.println("\nInorder : ");
			inOrder(root);
			
			System.out.println("\n");


			Node n = lca(root,root.left.left,root.left.right.left);
			if(n==null)
				System.out.println("NULL");
			else
				System.out.println(n.data);


	}
}
