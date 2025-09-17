class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //1.maintaing monotonic stack in decreasing order
        //2.keep track of window if exeed pop from dq
        Deque<Integer> dq = new ArrayDeque<>();
        int[] arr = new int[nums.length - k+1];
         int index = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(!dq.isEmpty() && dq.peek() == i-k){
                dq.poll();//popFront
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
            {
                dq.pollLast();//popLast - stack
            }
            dq.offer(i);//pushLash- stack
           
            if(i >= k-1)
            {
                arr[index++] = nums[dq.peek()];
            }
            
        }
        return arr;

    }
}






























   // int n = nums.length;
        // int l = 0;
        // int r = l + k-1;
        // // int[] ans = new int[n-k-1];
        // List<Integer> list = new ArrayList<>();
        // while(l<n-k+1 )
        // {
        //     int maxValue = Integer.MIN_VALUE;  
        //     for(int i = l ; i<=r;i++)
        //     {
        //         maxValue = Math.max(nums[i],maxValue);
        //     }
        //     list.add(maxValue);
        //     l++;
        //     r = l + k-1;
        // }
        // int[] arr = new int[list.size()];
        // int index = 0;
        // for(int i : list)
        // {
        //     arr[index++] = i;
        // }
        // return arr;