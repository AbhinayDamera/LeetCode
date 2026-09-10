import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // count frequency
        for(int i = 0; i < nums.length; i++){

            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        int[] result = new int[k];

        for(int i = 0; i < k; i++){

            int maxFreq = 0;
            int maxElement = 0;

            // find maximum frequency element
            for(Integer key : map.keySet()){

                if(map.get(key) > maxFreq){
                    maxFreq = map.get(key);
                    maxElement = key;
                }
            }

            result[i] = maxElement;

            // remove selected element
            map.remove(maxElement);
        }

        return result;
    }
}