package org.example;

import java.util.Arrays;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums){
        int writePointer=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){
                nums[writePointer]=nums[i];
                writePointer++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return writePointer;
    }
}
