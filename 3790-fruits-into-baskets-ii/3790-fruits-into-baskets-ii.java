import java.util.*;
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        // int count = 0;
        // for(int i=0;i<fruits.length;i++)
        // {
        //     for(int j = 0;j<baskets.length;j++)
        //     {
        //         if(fruits[i] <= baskets[j])
        //         {
        //             count++;
        //             baskets[j] = 0;
        //             break;
        //         }
        //     }
        // }
        // return fruits.length - count;
        List<Integer>list = new ArrayList<>();
        for(int i : baskets)
        {
            list.add(i);
        }
        int unPlaced = 0;
        for(int fruit: fruits)
        {
            int count = 0;
            for(int i = 0;i<list.size()  ;i++)
            {
                if(list.get(i) >= fruit)
                {
                    count++;
                    list.remove(i);
                    break;
                }
            }
            if(count == 0)
            {
                unPlaced++;
            }
        }
        return unPlaced;

    }
}


// Brute force method

        // List<Integer>list = new ArrayList<>();
        // for(int i : baskets)
        // {
        //     list.add(i);
        // }
        // int unPlaced = 0;
        // for(int fruit: fruits)
        // {
        //     int count = 0;
        //     for(int i = 0;i<list.size()  ;i++)
        //     {
        //         if(list.get(i) >= fruit)
        //         {
        //             count++;
        //             list.remove(i);
        //             break;
        //         }
        //     }
        //     if(count == 0)
        //     {
        //         unPlaced++;
        //     }
        // }
        // return unPlaced;