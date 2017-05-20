/*10 Stock Span Problem
Naive approach
O(n^2) solution and O(1) extra space
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol10_a {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	for(int i=0;i<n;i++){
		a[i] = sc.nextInt();	
	}
	int cnt = 1;
	for(int i=0;i<n;i++){
		cnt=1;		
		for(int j=i-1;j>=0;j--){
			if(a[j]<=a[i]){
				cnt++;
				continue;
			}
			break;
		}
		System.out.print(cnt+" ");
	}
    }
    
}
