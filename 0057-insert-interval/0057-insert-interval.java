import java.util.*;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list=new ArrayList<>();
        List<int[]> interval = new ArrayList<>();
        for(int[] i : intervals){
            list.add(i);
        }
        list.add(newInterval);

        //sorting
        Collections.sort(list,(a,b)->{
            return Integer.compare(a[0],b[0]);
        });

        //merging overlapping intervals
        
        for(int i = 0;i<list.size();i++){
            // if(interval.length != 0){
            //     int end = interval.get(interval.size() - 1)[1];
            // }
            // int start = list.get(i).[0];
            if(interval.size() == 0 || list.get(i)[0] > interval.get(interval.size() - 1)[1]){
                interval.add(list.get(i));
            }
            else{
                int end = Math.max(interval.get(interval.size() - 1)[1],list.get(i)[1]);
                interval.get(interval.size() -1)[1] = end;
            }
        }

        int[][] arr = new int[interval.size()][interval.get(0)[0]];
        int index = 0;
        for(int[] i : interval){
            arr[index] = i;
            index++;
        }
        return arr;
        
    }
}