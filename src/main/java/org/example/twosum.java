package org.example;

import java.util.HashMap;
import java.util.Map;

public class twosum {
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        int diff;
        Map<Integer, Integer> indexVal = new HashMap<Integer, Integer>();

        for(int i=0; i< nums.length; i++) {
            diff = target-nums[i];
            if(!indexVal.containsKey(diff)){
                indexVal.put(nums[i],i);
            }else {
                result[0]=indexVal.get(diff);
                result[1]=i;
                return result;
            }
        }
        return result;
    }
}
