package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class LenghtOfLongestValidSubstring {
    //brute force
    public int longestValidSubstring(String word, List<String> forbidden) {
        Set<String> set = new HashSet();
        for (int i=0; i<word.length(); i++){
            set.add(Character.toString(word.charAt(i)));
        }

        for (int i=0; i<word.length(); i++){
            String curretSub=Character.toString(word.charAt(i));
            for (int j=i+1; j<word.length(); j++) {
                curretSub = (curretSub + (word.charAt(j)));
                if(!isForbidden(curretSub, forbidden)){
                    set.add(curretSub);
                    }
                }
            }

        for (Object element:set){
            System.out.println(element);
        }
        return set.size();
    }

    public boolean isForbidden(String currentSubString, List<String> forbidden){
        boolean result=true;
        for(String element: forbidden){
            if (currentSubString.contains(element)){
                result=true;
                return true;
            }
            else result=false;
        }
        return result;
    }

    public int longestSubArray(Set<String> allValidSubString){
        //write logic for bruteforce here
        return 0;
    }
}
