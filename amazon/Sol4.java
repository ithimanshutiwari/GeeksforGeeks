/*
4.  Print all possible strings that can be made by placing spaces http://www.geeksforgeeks.org/print-possible-strings-can-made-placing-spaces/  
Time O(1) and O(1) space
*/

import java.util.*;
import java.math.*;
public class Sol4{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = (int)(Math.log(n&(~n+1))/Math.log(2)+1);
		System.out.println(x);	
	}
}
				
