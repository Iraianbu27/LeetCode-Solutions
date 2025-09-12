class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;
        // int i = 0;
        for(int i:asteroids)
        {
            if(i >0)
            {
                st.push(i);
            }
            else{
                while(!st.isEmpty() && (st.peek() >0 && st.peek() < -i))
                {
                    st.pop();
                }
                if(st.isEmpty() || st.peek() < 0)
                {
                    st.push(i);
                }
                if(st.peek() == -i){
                    st.pop();
                }
            }
        }
        int[] ans = new int[st.size()];
        for(int j = ans.length-1;j>=0;j--)
        {
            ans[j] = st.pop();
        }
        return ans;
        
    }
}