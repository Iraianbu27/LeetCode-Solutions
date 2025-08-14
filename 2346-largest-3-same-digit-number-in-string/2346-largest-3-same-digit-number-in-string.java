class Solution {
    public String largestGoodInteger(String num) {
        char element = num.charAt(0);
        int count = 0;
        String finalEle = "";
        int max = -1;
        for(int i = 0;i<num.length();i++)
        {
            if(num.charAt(i) == element)
            {
                count++;
                if(count == 3)
                {
                    if((Integer.parseInt(String.valueOf(element))) > max)
                    {
                        max = (Integer.parseInt(String.valueOf(element)));
                    }
                    
                    
                }
            }
            else{
                count = 1;
                element = num.charAt(i);
            }
        }
        if(max == -1)
        {
            return "";
        }
      return String.valueOf(max).repeat(3);

    }
}