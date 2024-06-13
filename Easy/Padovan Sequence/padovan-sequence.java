//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.padovanSequence(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
  public int padovanSequence(int n)
    {
        //code here.nt
        if(n <=2) return 1;
        int[] a = new int[n + 1];
        a[0] = 1;
        a[1] = 1;
        a[2] = 1;
        int mod = 1000000007;
        for(int i=3;i<=n;i++){
            a[i] = (a[i - 2] % mod + a[i - 3] % mod) % mod;
        }
        return a[n];
    }
    
}
