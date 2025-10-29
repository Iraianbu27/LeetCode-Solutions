import java.util.*;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int i = 0;
        List<int[]> list = new ArrayList<>();


        //adding intervals till new interval to list
        while(i<n && intervals[i][1] < newInterval[0]){
            list.add(intervals[i]);
            i++;
        }

        //adding overlapping interval with newInterval to list
        //we compare start of interval and end of new interval to get the overlapping
        //in general we only compare end of interval and start of newInterval to check for overlapping since we already finded that before we know for sure the coming interval is overlap with the newInterval so so check how many interval's starting is lesser that the newIntervals ending so we find out all the overlapping intervals
        while(i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        list.add(newInterval);

        //adding remaing interval to list
        while(i<n){
            list.add(intervals[i]);
            i++;
        }
        
        int[][] arr = new int[list.size()][list.get(0)[0]];
        int index = 0;
        for(int[] j : list){
            arr[index] = j;
            index++;
        }
        return arr;

    }
}
//brute force 
    //     List<int[]> list=new ArrayList<>();
    //     List<int[]> interval = new ArrayList<>();
    //     for(int[] i : intervals){
    //         list.add(i);
    //     }
    //     list.add(newInterval);

    //     //sorting
    //     Collections.sort(list,(a,b)->{
    //         return Integer.compare(a[0],b[0]);
    //     });

    //     //merging overlapping intervals
        
    //     for(int i = 0;i<list.size();i++){
    //         // int start = list.get(i).[0];
    //         if(interval.size() == 0 || list.get(i)[0] > interval.get(interval.size() - 1)[1]){
    //             interval.add(list.get(i));
    //         }
    //         else{
    //             int end = Math.max(interval.get(interval.size() - 1)[1],list.get(i)[1]);
    //             interval.get(interval.size() -1)[1] = end;
    //         }
    //     }

    //     int[][] arr = new int[interval.size()][interval.get(0)[0]];
    //     int index = 0;
    //     for(int[] i : interval){
    //         arr[index] = i;
    //         index++;
    //     }
    //     return arr;
        
    // }