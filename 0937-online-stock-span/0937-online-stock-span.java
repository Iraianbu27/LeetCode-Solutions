class StockSpanner {
    List<Integer> list;
    Stack<Integer> st;
    int index = -1;
    public StockSpanner() {
        list = new ArrayList<>();
        st = new Stack<>();
        index = -1;
    }
    
    public int next(int price) {
        index = index + 1;
        int span = 0;
            while(!st.isEmpty() && price >= list.get(st.peek()) )
            {
                // list.get(st.peek());
                st.pop();
                
            }
            span = index - (st.isEmpty() ? -1 : st.peek());
            st.push(index);
            list.add(price);

        
        return span;
       
       
    }
}
 // if(list.size() == 1)
        // {
        //     return 1;
        // }
        // else{
        //     int currDay = list.get(list.size() - 1);
        //     for(int i = list.size()-1;i>=0;i--)
        //     {
        //         if(list.get(i) <= currDay)
        //         {
        //             span++;
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return span;

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */