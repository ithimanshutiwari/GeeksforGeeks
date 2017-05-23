/*
1. Binary tree introduction
http://www.geeksforgeeks.org/binary-tree-set-1-introduction/
*/
class Node{
	int item;
	Node left,right;

	public Node(int item){
		this.item=item;
		left=null;
		right=null;
	}

}

class Sol1{
	
	public static void main(String[] args){
			Node root = new Node(1);
			System.out.println(root.item+" "+root.left);
	}
}
