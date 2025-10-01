import java.util.*;
class Solution {
    public int meetings(int[][] intervals){
        Arrays.sort(intervals,(a,b)->{
            return Integer.compare(a[1],b[1]);
        });
        int start = intervals[0][1];
        int count = 1;
        for(int i =1;i<intervals.length;i++){
            if(intervals[i][0] >= start)
            {
                count++;
                start = intervals[i][1];
            }
        }
        return intervals.length-count;

    }
    public int eraseOverlapIntervals(int[][] intervals) {
       return  meetings( intervals);
    }
}