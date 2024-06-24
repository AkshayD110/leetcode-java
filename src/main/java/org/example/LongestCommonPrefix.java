package org.example;

import java.util.*;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        HashMap<String, Integer> strLen = new HashMap<>();
        String outputString="";
        for(String element: strs){
            strLen.put(element, element.length());
        }

        List<Integer> numLenghts=new ArrayList<>(strLen.values());
        numLenghts.sort(null);
        int smallestSubStrLen=numLenghts.get(0);

        for(int i=0; i<=smallestSubStrLen; i++){
            Set<String> repeatElementCheck=new HashSet<>();
            String currentChar="";
            for (String element: strs){
                if(element.length()==0){
                    break;
                }
                currentChar=String.valueOf(element.charAt(i));
                repeatElementCheck.add(currentChar);
            }
            if(repeatElementCheck.size()==1){
                outputString=outputString+currentChar;
            }else {
                break;
            }
        }

        return outputString;
    }
    //optimized one. The trick using prefix as first element and using "Startswith"
    public String longestCommonPrefixOpt(String[] strs) {
        if (strs.length==0){
            return "";
        }
        String prefix=strs[0];

        for(int i=1; i<strs.length; i++){
            while (prefix.length() > 0){
                if(!strs[i].startsWith(prefix)){
                    prefix=prefix.substring(0,prefix.length()-1);
                }else{
                    break;
                }
            }
        }
        return prefix;
    }
}
