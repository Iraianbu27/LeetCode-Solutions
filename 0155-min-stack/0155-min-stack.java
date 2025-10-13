// class MinStack {
//     Stack<Long> st  ;
//     long min ;
//     public MinStack() {
//         st = new Stack<>();
//         min = Long.MAX_VALUE;
//     }
    
//     public void push(int vall) {
//         long val = (long)vall;
//         if(st.isEmpty())
//         {
//             min= val;
//             st.push(val);
//         }
//         else if(val> min){
//             st.push(val);
//         }
//         else{
//             long cal = (long)2*val - (long)min;
//             st.push(cal);
//             min = val;
//         }        
//     }
    
//     public void pop() {
//         long x = st.peek();
//         st.pop();
//          if(min > x)
//          {
//              min = (long)2*min - (long)x;
//          }
//     }
    
//     public int top() {
//         if(st.peek() > min)
//         {
//             return st.peek().intValue();
//         }
//         return (int)min;
//     }
    
//     public int getMin() {
//         return (int)min;
//     }
// }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */




class MinStack{
    Stack<Integer> og;
    Stack<Integer> min;
    
    public MinStack(){
        og = new Stack<>();
        min = new Stack<>();
        
    }
    public void push(int x){
        og.push(x);
        if(min.isEmpty() || x <= min.peek()){
            min.push(x);
        }
    }
    public int pop(){
        int val = og.pop();
        if(val == min.peek()){
            min.pop();
        }
        return val;

    }
    public int top(){
        return og.peek();
    }
    public int getMin(){
        return min.peek();
    }
}



















































































