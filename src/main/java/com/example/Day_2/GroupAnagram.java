/*
Old Approach:
First I started with two hashmaps which was working but was highly
inefficient as two hashmaps were being used.

Previously I was also using an added function to check for the anagram and then add it to the list. 
The previous approach was comparing pairs, had the complexity of O(n^2 x k), modifying list while iterating and 
had higher debugging difficulty.

New Approach:
The new approach uses signature, one hashmap, 
has the complexity of O(n x k log k), and doesn't modify while iterating.
*/
package com.example.Day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    List<List<String>> groupAnagrams(String[] strs)
    {
        
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs)
        {
            char[] ch= str.toCharArray();
            Arrays.sort(ch);
            String key= new String(ch);
            if(!map.containsKey(key))
                map.put(key,new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args)
    {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        GroupAnagram obj= new GroupAnagram();
        List<List<String>> list= obj.groupAnagrams(strs);
        list.forEach(System.out::println);
    }
}
