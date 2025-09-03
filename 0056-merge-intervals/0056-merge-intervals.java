class Solution {
    public int[][] merge(int[][] intervals) {
        //1.hold the start index START =  intervals[0][0]
        //hold the end index END =  intervals[0][1]

        //2.check next interval is inside the start and end if yes increase the interval

        //3.if no possible interval for intervals[0] is done move to intervals of[1]
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i<intervals.length;i++)
        {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(!list.isEmpty() && end <= list.get(list.size()-1).get(1)) continue;
            for(int j = i+1;j<intervals.length;j++)
            {
                if(intervals[j][0] <= end)
                {
                    end = Math.max(end,intervals[j][1]);
                }
                else
                {
                    break;
                }
            }
        list.add( Arrays.asList(start,end));
        }
        int[][] arr = new  int[list.size()][list.get(0).size()];
         for(int i =0;i<=list.size()-1;i++)
        {
            for(int j = 0;j<=list.get(0).size() - 1;j++)
            {
                arr[i][j] = list.get(i).get(j);
            }
        }
        return arr;
    }
}