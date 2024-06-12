//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.countNumberswith4(n);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int countNumberswith4(int n) {
        // code here
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(checkFour(i)) cnt++;
        }
        return cnt;
    }
    static boolean checkFour(int n){
        while(n > 0){
            int digit = n % 10;
            if(digit == 4) return true;
            n = n / 10;
        }
        return false;
    }
}
