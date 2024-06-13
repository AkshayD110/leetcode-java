package org.example;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int orgNum=x;
        if (x<0){
            return false;
        }
        int reverseNum=0, quo, rem;
        while (x>0){
            quo=x/10;
            rem=x%10;
            reverseNum=rem + (reverseNum*10);
            x=quo;
        }
        System.out.println(reverseNum);
        if (orgNum == reverseNum){
            return true;
        }else return false;

    }
}
