/*
11.Vertical sum in a binary tree
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

class NSol11{


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

	static void fill(Node root,HashMap<Integer,Integer> map, int c){
		if(root==null)
			return;
		int data = 0;
		if(map.containsKey(c))
			data=map.get(c);
		map.put(c,root.data+data); 	
		fill(root.left,map,c-1);
		fill(root.right,map,c+1);
	}
	


	
	public static void main(String[] args){
			int[] inorder = {4,2,5,1,6,3,7};
			int[] postorder ={4,5,2,6,7,3,1};
			Node root = buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1); 

			System.out.println("\nPreorder : ");
			preOrder(root);
			System.out.println("\nInorder : ");
			inOrder(root);
			
			System.out.println("\n");


			HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
			fill(root,map,0);
			for(int i:map.keySet()){
				System.out.println(i+" "+map.get(i));
			}

	}
}
