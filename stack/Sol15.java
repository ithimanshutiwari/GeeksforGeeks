/*
15. Tower of Hanoi
http://www.geeksforgeeks.org/stack-data-structure/
Time O(2^n) and O(1) space
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol15 {
	
	static void toh(int n, char a,char b, char c){
		if(n>0){
			toh(n-1,a,c,b);
			System.out.println(a+" --> "+c);
			toh(n-1,b,a,c);			
		}	
	}
	

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	
	int n = sc.nextInt();
	toh(n,'S','A','D');
    }
    
}
