//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) end[i] = Integer.parseInt(inputLine[i]);

            int ans = new Solution().maxMeetings(n, start, end);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public class Meeting{
        int startTime;
        int endTime;
        
        public Meeting(int startTime, int endTime){
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }
    public int maxMeetings(int n, int start[], int end[]) {
        // add your code here
        Meeting[] meeting = new Meeting[n];
        for(int i=0;i<n;i++){
            meeting[i] = new Meeting(start[i], end[i]);
            
        }
        Arrays.sort(meeting, (a, b) -> a.endTime - b.endTime);
        int count = 1;
        int freeTime = meeting[0].endTime;
        for(int i=1;i<n;i++){
            if(meeting[i].startTime > freeTime){
                count++;
                freeTime = meeting[i].endTime;
            }
        }
        return count;
    }
}
