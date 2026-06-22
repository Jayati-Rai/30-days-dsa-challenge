package com.example.Day_11;
/*
The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

 

Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] result =new int[n1];
        // Arrays.fill(result,-1);
        Stack<Integer> stack =new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums2)
        {
            while(!stack.isEmpty() && num>stack.peek())
            {
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        while(!stack.isEmpty())
            map.put(stack.pop(),-1);
        for(int i=0;i<n1;i++)
            result[i]=map.get(nums1[i]);
        
        return result;
    }
    public static void main(String args[])
    {
        int nums1[]={4,1,2};
        int nums2[]={2,1,3,4};
        NextGreaterElement obj=new NextGreaterElement();
        int[] result=obj.nextGreaterElement(nums1, nums2);
        for(int num:result)
        {
            System.out.println(num);
        }
    }
}   

