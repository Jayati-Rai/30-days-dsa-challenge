/*
Given an integer array nums, return all the triplets 
[nums[i], nums[j], nums[k]] 
such that i != j, i != k, and j != k, 
and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */
/*
The most efficient method would be using two pointer method.
first let's sort the array so that we don't have the duplicate in the set.
*/
package com.example.Day_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class P_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        //sort array
        Arrays.sort(nums);
        int n=nums.length;
        //use the sorted array to find triplets using pointer method
        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int j=i+1,k=n-1;
            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum>0)
                {
                    k--;
                    continue;
                }
                else if(sum<0)
                {
                    j++;
                    continue;
                }
                else{
                    triplets.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                while(j<k && nums[j]==nums[j-1])
                {
                    j++;
                }
                while(j<k && nums[k]==nums[k+1])
                {
                    k--;
                }
            }
        }
        return triplets;
    }
    public static void main(String[] args)
    {
        P_3Sum obj=new P_3Sum();
        int nums[]={1,-1,2,0,-1};
        List<List<Integer>> tripletsList=new ArrayList<>();
        tripletsList=obj.threeSum(nums);
        System.out.println(tripletsList);
    }
        
}
