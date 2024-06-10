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
            if (indexVal.containsKey(nums[i])){
                result[0]=indexVal.get(nums[i]);
                result[1]=i;
                return result;
            }else {
                indexVal.put(diff, nums[i]);
            }
        }
        return result;
    }
}
