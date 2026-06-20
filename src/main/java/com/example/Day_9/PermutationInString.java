/*
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 */
//--------------------------------------------------------------------
/*
 * Problem: Permutation in String
 *
 * Pattern: Fixed Sliding Window + Frequency Counting
 *
 * Thought Process:
 * 1. A permutation must contain exactly the same characters and frequencies
 *    as s1.
 * 2. Therefore, every valid substring must have length = s1.length().
 * 3. This means we do NOT need a dynamic window like Minimum Window Substring.
 * 4. Instead, maintain a fixed-size window of length s1.length() over s2.
 * 5. Store character frequencies of:
 *      - s1 (required frequencies)
 *      - current window in s2
 * 6. Compare frequencies:
 *      - If they match, a permutation exists.
 * 7. Slide the window:
 *      - Add the new character entering the window.
 *      - Remove the character leaving the window.
 *      - Check frequencies again.
 *
 * Key Insight:
 * The moment I realized every valid permutation must have the same length
 * as s1, the problem became a Fixed Sliding Window problem instead of a
 * Dynamic Sliding Window problem.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
package com.example.Day_9;


class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m) {
            return false;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        for (int i = 0; i < n; i++) {
            need[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        if (matches(need, window)) {
            return true;
        }

        for (int i = n; i < m; i++) {
            // Add new character
            window[s2.charAt(i) - 'a']++;

            // Remove leftmost character
            window[s2.charAt(i - n) - 'a']--;

            if (matches(need, window)) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        PermutationInString obj=new PermutationInString();
        String s1="ya";
        String s2="jayati";
        System.out.println(obj.checkInclusion(s1, s2));
    }
}