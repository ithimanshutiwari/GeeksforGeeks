/*
15.
Two Trees are Identical
http://www.geeksforgeeks.org/write-c-code-to-determine-if-two-trees-are-identical/
Time(O(min(m,n))
16. Maximum Depth or Height of a Tree
http://www.geeksforgeeks.org/write-a-c-program-to-find-the-maximum-depth-or-height-of-a-tree/
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

class Sol15{

	public static boolean isSame(Node root1, Node root2){
		if(root1==null && root2==null)
			return true;
		else if(root1==null && root2!=null)
			return false;
		else if(root1!=null && root2==null)
			return false;
		else{
			boolean a = (root1.data==root2.data);
			boolean b = isSame(root1.left,root2.left);
			boolean c = isSame(root1.right,root2.right);
			
			if(a && b && c)
				return true;
		}
		return false;
	}

	private static int height(Node root){
		if(root==null)
			return 0;
		else if(root.left==null && root.right==null)
			return 0;
		return 1+Math.max(height(root.left),height(root.right));

	}
	
	public static void main(String[] args){
			Node root1 = new Node(1);
			root1.left = new Node(2);
			root1.right = new Node(3);
			

			Node root2 = new Node(1);
			root2.left = new Node(2);
			root2.left.left = new Node(4);
			root2.left.right = new Node(5);

			System.out.println(isSame(root1,root2));

			System.out.println(height(root2));
			
	}
}
