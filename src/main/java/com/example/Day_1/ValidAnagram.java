package com.example.Day_1;

public class ValidAnagram {
    boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();
        String s = "listen";
        String t = "silent";
        boolean result = solution.isAnagram(s, t);
        System.out.println("Are the two strings anagrams? " + result);
    }
}
