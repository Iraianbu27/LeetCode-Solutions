class Solution {
    public List<List<Integer>> fourSum(int[] nums, int tar) {
         int n = nums.length;
     
       List<List<Integer>> list = new ArrayList<>();
       Arrays.sort(nums);
     for(int l = 0;l<=n-4;l++)
     {
        if(l>0 && nums[l] == nums[l-1]) continue;
        //l->i->j->k
        for(int i = l+1;i<=n-3;i++)
       {
            if(i>l+1 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while( j<k)
            {
                long sum = (long)nums[i] + nums[j] + nums[l] +  nums[k];
                long target = (long) tar;
                if( sum < target){
                    j++;
                }
                else if(sum > target)
                {
                    k--;
                }
                else{
                    List<Integer> newList = new ArrayList<>(Arrays.asList(nums[l],nums[i],nums[j],nums[k]));
                    list.add(new ArrayList<>(newList));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1])
                    {
                        j++;
                    }
                    while(k>j && nums[k] == nums[k+1])
                    {
                        k--;
                    }
                }
            }
        }
     }
    return list;
    }
}