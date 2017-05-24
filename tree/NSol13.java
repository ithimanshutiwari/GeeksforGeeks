/*
13. Expression Tree creation
O(n) time and O(n) space
*/
import java.util.*;

class Node{
	char data;
	Node left,right;

	public Node(char item){
		data=item;
		left=null;
		right=null;
	}

}

class NSol13{

	static void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}

	static boolean isOperator(char c){
		return c=='+'||c=='-'||c=='*'||c=='/'||c=='^';
	}

	static Node exTree(String s){
		Stack<Node> st = new Stack<Node>(); 
		for(int i=0;i<s.length();i++){
			if(isOperator(s.charAt(i))){
				Node a = st.pop();
				Node b = st.pop();
				Node c = new Node(s.charAt(i));
				c.left=b;
				c.right=a;
				st.push(c);
			}
			else{
				Node n = new Node(s.charAt(i));
				st.push(n);
			}
		}
		return st.pop();
	}

	public static void main(String[] args){
		String postfix="ABC*+D/";
		Node root = exTree(postfix); 
		inOrder(root);
	}
	
}