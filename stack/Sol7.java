/*7. Next Greater Element
Sample Input
4
4 5 2 25
Sample Output
4 5
5 25
2 25
25 -1
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack st = new Stack();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        st.push(a[0]);
        for(int i=1;i<n;i++){
            int x = (int)st.peek();
            //System.out.println(x+" "+a[i]);
            if(x>a[i]){
                st.push(a[i]);
            }
            else{              
                while(x<a[i] && !st.isEmpty()){
                    map.put((int)st.pop(),a[i]);
                    if(!st.isEmpty())
                        x=(int)st.peek();
                }
                st.push(a[i]);
            }
        }
        while(!st.isEmpty())
              map.put((int)st.pop(),-1);
        
    
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" "+map.get(a[i]));
        }
    }
    
}
