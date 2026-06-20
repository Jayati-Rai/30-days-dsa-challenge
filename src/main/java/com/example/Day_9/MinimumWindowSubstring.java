/*
Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

 

Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
Example 3:

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
*/
package com.example.Day_9;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring{
    public String minimumWindowSubstring(String s,String t)
    {
        int minLen=100000;
        int sIndex=-1;
        int l=0,r=0,count=0;
        int n=s.length();
        int m=t.length();
        char ch;
        Map<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<m;i++)
        {
            ch=t.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        while(r<n)
        {
            ch=s.charAt(r);
            if(freq.getOrDefault(ch,0)>0)
                count++;
            freq.put(ch,freq.getOrDefault(ch,0)-1);
            //valid window
            while(count==m)
            {
                if(r-l+1<minLen)
                {
                    minLen=r-l+1;
                    sIndex=l;
                }
                ch=s.charAt(l);
                freq.put(ch,freq.getOrDefault(ch, 0)+1);
                if(freq.get(ch)>0)
                    count--;
                l++;
            }
            r++;
        }
        
        return (sIndex==-1)?"":s.substring(sIndex,sIndex+minLen);
    }
    public static void main(String args[])
    {
        String s="ADOBECODEBANC";
        String t="ABC";
        MinimumWindowSubstring obj=new MinimumWindowSubstring();
        String str=obj.minimumWindowSubstring(s, t);
        System.out.println(str);
    }
}