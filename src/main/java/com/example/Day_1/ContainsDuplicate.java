/*
From the Day 1 learning, I first solved this question using HashMap
which is not the correct data structure to solve this question
as the value part is never being used. 

So, I used HashSet which is basically a set of unique elements.

Whenever an element is added to the set, if it already exists 
then set.add(num) function return false.

This is the core logic that we will use to solve this question.
*/
package com.example.Day_1;
import java.util.HashSet;
import java.util.Scanner;
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
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
        ContainsDuplicate solution = new ContainsDuplicate();
        boolean result = solution.containsDuplicate(nums);
        System.out.println("Does the array contain duplicates? " + result);
    }
}