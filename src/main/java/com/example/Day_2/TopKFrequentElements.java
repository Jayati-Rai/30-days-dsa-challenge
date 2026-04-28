package com.example.Day_2;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;
/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2

Output: [1,2]

Example 2:

Input: nums = [1], k = 1

Output: [1]

Example 3:

Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2

Output: [1,2]

 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique. */
public class TopKFrequentElements{
    public int[] topKFrequentElements(int[] nums, int k)
    {
        //Step 1: Obviously we need a frequency table 
        // and that we can achieve by hashing.
        Map <Integer,Integer> map=new HashMap<>();
        for(int num: nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        //now that we have the frequency table,
        //we can start working on creating a minHeap of size K 
        //inorder to access the numbers with highest frequency

        PriorityQueue <int[]> minHeap=new PriorityQueue<>((a,b) ->a[0]-b[0]);
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            int num=entry.getKey();
            int frequency=entry.getValue();

            //now we enter the frequency in minHeap

            minHeap.offer(new int[]{frequency,num});
            if(minHeap.size()>k)
            {
                minHeap.poll();//remove the weakest member;
            }
        }
            int result[]=new int[k];
            for(int i=0;i<k;i++)
            {
                result[i]=minHeap.poll()[1];
            }
            return result;

        
    }
    public static void main(String args[])
    {
        int[] nums={1,2,1,2,3,4,4,4,4,5,6,7};
        TopKFrequentElements obj=new TopKFrequentElements();
        int k=3;
        int [] result=new int[k];
        result=obj.topKFrequentElements(nums,k);
        for(int num:result)
        {
            System.out.println(num);
        }

    }

}