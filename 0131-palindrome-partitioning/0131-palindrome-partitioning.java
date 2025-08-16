import java.util.*;
class Solution {

    public static boolean palindrome(String s,int start,int end)
    {
        int i=start,j = end;
        while(i<j)
        {
            if((s.charAt(i)) != (s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void recPar(List<List<String>> list,List<String> temp,String s,int index)
    {
        if(index == s.length())
        {
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i = index ;i < s.length(); i++)
        {
            if(palindrome(s,index,i)){
                temp.add(s.substring(index,i+1));
                recPar(list,temp,s,i + 1);
                temp.remove(temp.size()-1);
            }

        }

    }
    public List<List<String>> partition(String s) {
        List<String> temp = new ArrayList<>();
        // List<String>  = new ArrayList<>();
        List<List<String>> list = new ArrayList<>();
        recPar(  list, temp,s,0);
        return list;
    }
}