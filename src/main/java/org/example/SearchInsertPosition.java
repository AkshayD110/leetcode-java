package org.example;

//https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i< nums.length; i++){
            int diff = nums[i]-target;
            if (diff >= 0) {
                return i;
            }
        }
        return nums.length;
    }
}
