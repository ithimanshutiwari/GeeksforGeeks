/*
12. Number of binary tree with n node
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

class NSol12{


	public static void main(String[] args){
		int n = new Scanner(System.in).nextInt();
		long[] count = new long[n+1];
		count[0]=1;
		count[1]=1;
		for(int i=2;i<=n;i++){
			for(int j=0;j<i;j++){
				count[i]+=count[j]*count[i-j-1];
			}
		}
		System.out.println(count[n]);			

	}
	
}