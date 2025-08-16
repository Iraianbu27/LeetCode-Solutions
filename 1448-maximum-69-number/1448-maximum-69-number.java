import java.util.*;
class Solution {

    public static void rec(char[]  arr,int i)
    {
        if(i == arr.length){
            return;
        }
        else if(arr[i] == '6')
        {   
            arr[i] = '9';
            return;
        }
        else{
            rec(arr,i + 1);
        }

    }
    public int maximum69Number (int num) {
        List<Integer> list = new ArrayList<>();
        String numString  = String.valueOf(num);
        char[] arr = numString.toCharArray();
        // for(char i : arr)
        // {
        //     list.add(Integer.parseInt(String.valueOf(i));
        // }
        rec(arr,0);
        String finalString = String.valueOf(arr);
        int finalInt = Integer.parseInt(finalString);

        return finalInt;
        
        

    }
}