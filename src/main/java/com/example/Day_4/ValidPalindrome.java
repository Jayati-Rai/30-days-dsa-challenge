/*
Question:
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
*/

/*
Explanation: We use two pointers, one starting from the beginning (front) and the other from the end (rear) of the string.
We move the pointers towards each other, skipping non-alphanumeric characters, and compare the characters at each position.
If at any point the characters don't match, we return false.
If we successfully traverse the string without finding any mismatches, we return true.
*/
package com.example.Day_4;

public class ValidPalindrome {
    public boolean validPalindrome(String s)
    {
        int front=0,rear=s.length()-1;
        char ch_f,ch_r;
        while(front<rear)
        {
            ch_f=Character.toLowerCase(s.charAt(front));
            ch_r=Character.toLowerCase(s.charAt(rear));
            if(!Character.isLetterOrDigit(ch_f))
            {
                front++;
            }
            else if(!Character.isLetterOrDigit(ch_r))
            {
                rear--;
            }
            else
            {
                if(ch_f!=ch_r)
                {
                    return false;
                }
                front++;
                rear--;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        ValidPalindrome obj=new ValidPalindrome();
        String s="A man, a plan, a canal: Panama";
        boolean result=obj.validPalindrome(s);          
        System.out.println(result);
}
}