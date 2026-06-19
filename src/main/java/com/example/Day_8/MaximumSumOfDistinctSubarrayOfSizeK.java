package com.example.Day_8;

import java.util.HashMap;
import java.util.Map;

public class MaximumSumOfDistinctSubarrayOfSizeK {

    int maximumSumSubarrayOfSizeK(int nums[],int k)
    {
        int windowSum=0;
        int maxSum=0;

        int left=0,right;
        Map<Integer,Integer> freq=new HashMap<>();
        for(right=0;right<nums.length;right++)
        {
            windowSum+=nums[right];
            freq.put(nums[right],
                freq.getOrDefault(nums[right],0)+1
            );
            //first condition when the diff in right and left+1 is more that k
            if(right-left+1>k)
            {
                //remove the left most element 
                windowSum-=nums[left];
                freq.put(nums[left],freq.get(nums[left])-1);
                if(freq.get(nums[left])==0)
                    freq.remove(nums[left]); 
                left++;
            }
            //when the difference is exactly equal to freq.size
            if(right-left+1==k && freq.size()==k)
                maxSum=Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
    
    public static void main(String args[])
    {
        MaximumSumOfDistinctSubarrayOfSizeK obj
            =new MaximumSumOfDistinctSubarrayOfSizeK();
        int[] nums={1,5,4,2,9,9};
        int k=3;
        int maxSum=obj.maximumSumSubarrayOfSizeK(nums,k);
        System.out.println(maxSum);

    }
}
