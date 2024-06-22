package org.example;

import javax.swing.text.AttributeSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class LenghtOfLongestValidSubstring {
    //brute force
    public int longestValidSubstring(String word, List<String> forbidden) {
        int maxSubStringLen=0;
        Set<String> set = new HashSet();

        for (int i=0; i<word.length(); i++){
            String curretSub=Character.toString(word.charAt(i));
            if(!isForbidden(curretSub, forbidden)){
                set.add(Character.toString(word.charAt(i)));
                maxSubStringLen=Math.max(curretSub.length(), maxSubStringLen);
            }
            for (int j=i+1; j<word.length(); j++) {
                curretSub = (curretSub + (word.charAt(j)));
                if(isForbidden(curretSub, forbidden)){
                    continue;
                }
                else{
                    set.add(curretSub);
                    maxSubStringLen=Math.max(curretSub.length(), maxSubStringLen);
                    }
                }
            }

        return maxSubStringLen;
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

    public int longestValidSubstringOpt(String word, List<String> forbidden) {
        Set<String> forbiddenSet = new HashSet<>(forbidden);
        int maxSubStringLen = 0;
        int left = 0;
        int n = word.length();

        for (int right = 0; right < n; right++) {
            for (int k = 1; k <= 10 && right - k + 1 >= left; k++) { // check the last 10 characters or less
                if (forbiddenSet.contains(word.substring(right - k + 1, right + 1))) {
                    left = right - k + 2; // move left pointer past the forbidden substring
                    break;
                }
            }
            maxSubStringLen = Math.max(maxSubStringLen, right - left + 1);
        }

        return maxSubStringLen;
    }

}
