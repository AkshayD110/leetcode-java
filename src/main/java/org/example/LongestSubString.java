package org.example;

import java.util.HashSet;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s){
        int left=0, right=0, maxSubArray=0;
        HashSet<Character> subArraySet = new HashSet<>();
        while (right < s.length()){
            if(!subArraySet.contains(s.charAt(right))){
                subArraySet.add(s.charAt(right));
                right++;
                maxSubArray=Math.max(maxSubArray, right-left);
            }else {
                subArraySet.remove(s.charAt(left));
                left++;
            }
        }

        return maxSubArray;
    }

}
