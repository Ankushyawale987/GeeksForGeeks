//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long[] ans = new Long[2];
        Long gcd = gcd(A, B);
        ans[1] = gcd;
        Long lcm = A * B / gcd;
        ans[0] = lcm;
        return ans;
        
    }
    public static Long gcd(Long a, Long b){
        while(b != 0){
            Long temp = b;
             b = a % b;
             a = temp;
        }
        return a;
    }
};