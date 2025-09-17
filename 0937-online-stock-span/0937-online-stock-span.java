class StockSpanner {
    List<Integer> list = new ArrayList<>();
    // public StockSpanner() {
        
    // }
    
    public int next(int price) {
        list.add(price);
        int span = 0;
        if(list.size() == 1)
        {
            return 1;
        }
        else{
            int currDay = list.get(list.size() - 1);
            for(int i = list.size()-1;i>=0;i--)
            {
                if(list.get(i) <= currDay)
                {
                    span++;
                }
                else{
                    break;
                }
            }
        }
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */