/*
Well since I solved my first two questions using HashMap and HashSet,
my mind was simply on the approach of hashing.
This particular question can be solved using hashing but it will be like,
taking a sword to a knife fight.
As the number of characters is limited (26 lowercase letters), 
we can use a fixed-size array for counting.
The increment and decrement operations on the count array will help us 
determine if the two strings are anagrams.
  */
package com.example.Day_1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class ValidAnagramTest {
    @Test
    public void testValidAnagram() {
        ValidAnagram solution = new ValidAnagram();
        assertTrue(solution.isAnagram("listen", "silent"));
        assertFalse(solution.isAnagram("hello", "world"));
    }

}
