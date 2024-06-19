package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        LenghtOfLongestValidSubstring lenghtOfLongestValidSubstring=new LenghtOfLongestValidSubstring();
        int output=lenghtOfLongestValidSubstring.longestValidSubstring("cbaaaabc", Arrays.asList("aaa","cb"));
        System.out.println(output);
    }
}