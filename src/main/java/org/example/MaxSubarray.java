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
