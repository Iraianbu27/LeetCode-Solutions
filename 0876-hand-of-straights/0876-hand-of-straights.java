class Solution {
public boolean isNStraightHand(int[] arr,int groupSize){
        if(arr.length%groupSize != 0)return false;
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0;i<arr.length;i++){ //O(n)
            if(!mpp.containsKey(arr[i])){
                mpp.put(arr[i],1);
            }
            else{
                mpp.put(arr[i],mpp.get(arr[i])+1);
            }
        }

        Arrays.sort(arr); // O(n log n)
        int j = 0;
        List<List<Integer>> group = new ArrayList<>();
        while(j<arr.length){
            int currKey = arr[j];
            if(mpp.containsKey(currKey)){
                //reduce currKey freq and remove it
                mpp.put(currKey,mpp.get(currKey)-1);
                if(mpp.get(currKey) == 0) mpp.remove(currKey);

                List<Integer> tempGroup = new ArrayList<>();
                tempGroup.add(currKey);
                int count = 1;
                for(int k = 0;k<groupSize-1;k++){ //O(groupSize)
                    if(mpp.containsKey(currKey+1)){
                        count++;
                        tempGroup.add(currKey+1);

                        //reduce freq of currKey+1 and remove it 
                        mpp.put(currKey+1,mpp.get(currKey+1)-1);
                        if(mpp.get(currKey+1) == 0) mpp.remove(currKey+1);
                    }
                    else{
                        return false;
                    }
                    currKey++;
                }
                if(count == groupSize){
                    group.add(new ArrayList<>(tempGroup));
                }
                else{
                    return false;
                }
            }
           
            j++;
        }

        // if(group.size() != groupSize   ){
        //     return false;
        // }
        return true;

    }
}
//tc - O(n) + O(n log n) + O(n) +O(groupSize) ~ O(n log n)
//sc - O(n) 