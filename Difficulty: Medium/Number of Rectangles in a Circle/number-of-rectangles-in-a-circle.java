//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            int ans = ob.rectanglesInCircle(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int rectanglesInCircle(int r) {
        // code herele 
        double d = r * 2;
        double cnt = 0;
        double area = 3.14 * r * r;
        for(int i=1;i<=d;i++){
            for(int j=1;j<=d;j++){
                double tempArea = i * j;
                double diag = Math.sqrt(i * i + j * j);
                if(tempArea <= area && d>=diag) cnt++;
            }
        }
        return (int)cnt;
    }
};