class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        
        int[] nge = new int[n];
        
        Stack<Integer> st = new Stack<>( );
        
        
         for(int i = (2*n)-1;i>=0;i--)
        {
            while(!st.isEmpty() && nums[i%n] >= st.peek())
            {
                 
                st.pop();
            }
            // nge[nums2[i]] = st.isEmpty() ? -1 : st.peek();
            // st.push(nums2[i]);
           if(i < n)
           {
                if(st.isEmpty())
                {
                    nge[i] = -1;
                   
                }
                else{
                    nge[i] = st.peek();
                
                    
                }
                
           }
        //   else{
        //      st.push(nums[i%n]);
        //   }
st.push(nums[i%n]);
        }
         
        return nge;
    }
}


// class Solution{
    
// public int[] nextGreaterElements(int[] nums){
//     int n = nums.length;
//     int[] nge = new int[nums.length];
//     Stack<Integer> st = new Stack<>();
  
//     for(int i = 2*n -1;i>=0;i--){
//         while(!st.isEmpty() && st.peek()<=nums[i%n]){
//             st.pop();
//         }
//         if(i < n){
//             if(st.isEmpty()){
//                 nge[i] = -1;
//                 // st.push(nums[i]);
//             }
//             else{
//                 nge[i] = st.peek();
//             }
//             st.push(nums[i]);
//         }
//         else{
//             st.push(nums[i%n]);
//         }
//     }
//     return nge;
// }
// }


//BRUTE APPROACH
  // for(int i = 2*n -1 ;i>=0;i--){
    //     if(st.isEmpty()){
    //         if(i < n-1){
    //             nge[i] = -1;

    //         }
    //          st.push(nums[i%n]);
    //     }
    //     else if(nums[i%n] >= st.peek()){
    //         while(!st.isEmpty() && nums[i%n] >= st.peek()){
    //             st.pop();
    //         }
    //         if(st.isEmpty()){
    //             if(i < n){
    //                 nge[i] = -1;
    //             }
    //             // st.push(nums[i%n]);
    //         }
    //         else{
    //             if(i<n){
    //                 nge[i] = st.peek();
    //             }
                
    //         }
    //         st.push(nums[i%n]);
    //     }
    //     else{
    //         if(i < n){
    //             nge[i] = st.peek();
    //         }
    //         st.push(nums[i%n]);
    //     }

    // }





