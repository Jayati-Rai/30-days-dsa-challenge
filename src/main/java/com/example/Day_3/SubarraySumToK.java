package com.example.Day_3;
/*
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
*/
import java.util.HashMap;
import java.util.Map;
class SubarraySumToK{
    public int subarraySum(int[] nums, int k) {
        int sum=0,count=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);//base case
        for(int num:nums)
        {
            sum+=num;
            if(map.containsKey(sum-k))
            {
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String args[])
    {
        SubarraySumToK obj=new SubarraySumToK();
        int[] nums={2,3,5,-2,0};
        int k=3;
        int count=obj.subarraySum(nums, k);
        System.out.println(count);
    }
}