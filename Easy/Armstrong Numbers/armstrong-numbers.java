//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        int result = 0;
        int num = n;
        // code here
        while(n > 0){
            int temp = n % 10;
            result = result + (int)Math.pow(temp, 3);
            n = n / 10;
        }
        if(num == result){
            return "true";
        }
        return "false";
    }
}