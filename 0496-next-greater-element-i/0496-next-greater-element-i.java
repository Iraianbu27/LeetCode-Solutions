class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        
        //traverse nums2 store the nge in mpp with that ele
        
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[10001];
        int n = nums2.length;
        for(int i = n-1;i>=0;i--)
        {
            while(!st.isEmpty() && nums2[i] >= st.peek())
            {
                st.pop();
            }
            nge[nums2[i]] = st.isEmpty() ? -1 : st.peek();
            st.push(nums2[i]);
            // if(st.isEmpty())
            // {
            //     nge[nums2[i]] = -1;
            //     st.push(nums2[i]);
            // }
            // else{
            //     nge[nums2[i]] = st.peek();
             
            //     st.push(nums2[i]);
            // }

        }
        //2.using mpp update nge of nums1
        for(int i = 0;i<nums1.length;i++)
        {
            nums1[i] = nge[nums1[i]];
        }
        return nums1;
         

    }
}
//APPROACH 1
  // //1.fill the nums1 arr with index of matching ele from nums2\
        // for(int i = 0;i<nums1.length;i++)
        // {
        //     for(int j = 0;j<nums2.length;j++)
        //     {
        //         if(nums2[j] == nums1[i])
        //         {
        //             nums1[i] = j;
        //             break;
        //         }
        //     }
        // }
        
        // //2.reverse traverse to find the greatest and store in new arr
        // int[] nge = new int[nums2.length];
        // Stack<Integer> st = new Stack<>();
        // int n = nums2.length;
        // for(int i = n-1;i>=0;i--)
        // {
        //     while(!st.isEmpty() && nums2[i] >= st.peek())
        //     {
        //         st.pop();
        //     }
        //     if(st.isEmpty())
        //     {
        //         nge[i] = -1;
        //         st.push(nums2[i]);
        //     }
        //     else{
        //         nge[i] = st.peek();
        //         st.push(nums2[i]);
        //     }

        // }
        // //3.update the nums2 array's greatest ele in nums1 for stored index
        // for(int i = 0;i<nums1.length;i++)
        // {
        //     nums1[i] = nge[nums1[i]];
        // }
        // return nums1;


//APPROACH 2
 // //traverse nums2 store the nge in mpp with that ele
        // Map<Integer,Integer> mpp = new HashMap<>();
        // Stack<Integer> st = new Stack<>();
        // int n = nums2.length;
        // for(int i = n-1;i>=0;i--)
        // {
        //     while(!st.isEmpty() && nums2[i] >= st.peek())
        //     {
        //         st.pop();
        //     }
        //     if(st.isEmpty())
        //     {
        //         mpp.put(nums2[i],-1);
        //         st.push(nums2[i]);
        //     }
        //     else{
        //         // nge[i] = st.peek();
        //         mpp.put(nums2[i],st.peek());
        //         st.push(nums2[i]);
        //     }

        // }
        // //2.using mpp update nge of nums1
        // for(int i = 0;i<nums1.length;i++)
        // {
        //     if(mpp.containsKey(nums1[i]))
        //     {
        //         nums1[i] = mpp.get(nums1[i]);
        //     }
        // }
        // return nums1;
