/*
3. Position of rightmost set bit http://www.geeksforgeeks.org/position-of-rightmost-set-bit/
Time O(1) and O(1) space
*/

import java.util.*;
import java.math.*;
public class Sol3{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = (int)(Math.log(n&(~n+1))/Math.log(2)+1);
		System.out.println(x);	
	}
}
				