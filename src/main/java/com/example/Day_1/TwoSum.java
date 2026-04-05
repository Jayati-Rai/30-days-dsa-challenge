/*
The first approached I used was basic comparision method using array
which was obviously an inefficient way of solvng this problem as it 
changes the time complexity to O(n^2).
So in order to optimize this solution, 
I used a HashMap to store the elements and their indices, 
which reduces the time complexity to O(n).    
 */
package com.example.Day_1;

import java.util.HashMap;
import java.util.Scanner;
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

for(int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];

    if(map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
    }

    map.put(nums[i], i);
}
return new int[]{-1,-1};
}

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    int[] nums=new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<n;i++)    {
        nums[i]=sc.nextInt();
    }
    System.out.println("Enter the target value:");
    int target=sc.nextInt();
    TwoSum solution = new TwoSum();
    int[] result = solution.twoSum(nums, target);
    System.out.println("Indices of the two numbers that add up to the target:");
    System.out.println(result[0] + " " + result[1]);

}
}
