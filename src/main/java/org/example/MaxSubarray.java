package org.example;

public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currentSum=0;
        for (int i=0; i< nums.length; i++){
            currentSum=Math.max(currentSum+nums[i], nums[i]);
            maxSum=Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}


#Model:
#- Two variable. currentSum and MaxSum
#- deciding if to start a new sub array or carry the current subarray is imp
#- use Math.Max to see which is greater in each iteration.
