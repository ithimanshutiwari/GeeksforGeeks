/*
1. Check if a string can be obtained by rotating another string 2 places: http://www.geeksforgeeks.org/check-string-can-obtained-rotating-another-string-2-places/
Time O(n) and O(1) space
*/

import java.util.*;
public class Sol1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String st1 = sc.next();
		String st2 = sc.next();
		int c1=0, c2=0;		
		if(st1.length()!=st2.length())
			System.out.println("No");
		else{
			int j=2,z=st1.length()-2;
			for(int i=0;i<st1.length();i++){
				if(st2.charAt(i)==st1.charAt(j)){
					j=(j+1)%(st1.length());
					c1++;
				}
				if(st2.charAt(i)==st1.charAt(z)){
					z=(z+1)%(st1.length());
					c2++;
					continue;
				}
			}
		}
		if(c1==st1.length()||c2==st1.length())
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
				