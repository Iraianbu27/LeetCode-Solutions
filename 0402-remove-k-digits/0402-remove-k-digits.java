class Solution {
    public String removeKdigits(String num, int k) {
        // if(k == num.length())
        // {
        //     return "0";
        // }
        Stack<Character> st= new Stack<>();
        for(int i = 0;i<num.length();i++)
        {
            while(!st.isEmpty() && k>0 && (num.charAt(i)-'0' < st.peek()-'0')){
                st.pop();
                k--;            
            }
            st.push(num.charAt(i));
        }
        while(k>0)
        {
            st.pop();
            k--;
        }
        StringBuilder kDigit = new StringBuilder();
        while(!st.isEmpty())
        {
            kDigit.append(st.peek());
            st.pop();
        }
        int index = 0;
        while(kDigit.length() > 0)
        {
            if(kDigit.charAt(kDigit.length() - 1) == '0')
            {
                kDigit.deleteCharAt((kDigit.length()) - 1);
            }
            else{
                break;
            }
        }
       
        return kDigit.length() > 0 ? kDigit.reverse().toString() : "0";
}
}
// int n = num.size();
        // if(k==0)
        // {
        //     return num;
        // }
        // char[] charArr = new char[n];
        // int index = 0;
        // for(char i : num.toCharArray())
        // {
        //     charArr[index++] =i;
        // }
        // List<Integer> list = new ArrayList<>();
        // for(char i: charArr)
        // {
        //     list.add(Integer.parseInt(String.valueOf(i)));
        // }
