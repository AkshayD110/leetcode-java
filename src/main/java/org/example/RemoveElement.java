package org.example;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int writer=0;
        for (int i=0; i< nums.length; i++){
            if(nums[i] != val){
                nums[writer]=nums[i];
                writer++;
            }
        }
        return writer;
    }
}
