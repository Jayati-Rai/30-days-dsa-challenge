package com.example.Day_8;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        int maxLength=0;
        int n=s.length();
        //a hashmap of number and its pos
        HashMap <Character,Integer> map=new HashMap<>();
        while(r<n)
        {
            char ch=s.charAt(r);
            if(map.containsKey(ch) && map.get(ch)>=l)
            {
            l=map.get(ch)+1;
            }
            map.put(ch,r);
            maxLength=Math.max(maxLength,r-l+1);
            r++;
        }
        return maxLength;
    }
    public static void main(String args[])
    {
        LongestSubstringWithoutRepeatingCharacters obj
        =new LongestSubstringWithoutRepeatingCharacters();
        String s="abcabbc";
        int maxLength=obj.lengthOfLongestSubstring(s);
        System.out.println(maxLength);
    }
}
