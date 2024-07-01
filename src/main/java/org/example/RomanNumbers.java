package org.example;

import java.util.HashMap;

public class RomanNumbers {
    public int romanToInt(String s) {
        int romanSum=0;
        int romanStringLen=s.length();

        HashMap<String, Integer> romanValMap = new HashMap<>();
        romanValMap.put("I", 1);
        romanValMap.put("V", 5);
        romanValMap.put("X", 10);
        romanValMap.put("C", 100);
        romanValMap.put("L", 50);
        romanValMap.put("D", 500);
        romanValMap.put("M", 1000);
        romanValMap.put("IV", 4);
        romanValMap.put("IX", 9);
        romanValMap.put("XL", 40);
        romanValMap.put("XC", 90);
        romanValMap.put("CD", 400);
        romanValMap.put("CM", 900);

        for(int i=0; i<romanStringLen; i++) {
            if(i<(romanStringLen-1)){
                String twoString=String.valueOf(s.charAt(i)) + s.charAt(i+1);
                if(romanValMap.containsKey(twoString)){
                    romanSum=romanSum+romanValMap.get(twoString);
                    i=i+1;
                    continue;
                }
            }
                String currentRom=String.valueOf(s.charAt(i));
                romanSum=romanSum+romanValMap.get(currentRom);

        }

        return romanSum;
    }
}
