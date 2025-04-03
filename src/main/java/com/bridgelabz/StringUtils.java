package com.bridgelabz;

public class StringUtils {
    public String reverseStr(String str){
        StringBuilder sb = new StringBuilder(str);
        return (sb.reverse().toString());
    }

    public boolean isPalindrome(String str){
        if(str.equals(reverseStr(str))){
            return true;
        }
        return false;
    }

    public String toUpper(String str){
        return str.toUpperCase();
    }
}
