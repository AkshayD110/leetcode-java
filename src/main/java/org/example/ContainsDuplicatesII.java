package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ContainsDuplicatesII {
    //Brute force
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i=0; i< nums.length; i++){
            //important to start the loop from after i
            for (int j=i+1; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    if((j-i) <=k){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicateBetter(int[] nums, int k) {
        //in this, a set is used to keep track if contition (i-j<=k)
        Set<Integer> set = new LinkedHashSet<>();
        for (int i=0; i< nums.length; i++){
            if (set.contains(nums[i])){
                return true;
            }else {
                set.add(nums[i]);
                //the below part is not very intutive to think of.
                if (set.size() > k){
                    set.remove(nums[i-k]);
                }
            }
        }
        return false;
    }
}
