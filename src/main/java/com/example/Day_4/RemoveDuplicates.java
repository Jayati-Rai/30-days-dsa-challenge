/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.

The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

 

Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */

/*
It is a two pointer approach where we maintain a pointer k
 to keep track of the position of the last unique element.
We iterate through the array with another pointer i, starting from the second element.
For each element at index i, we compare it with the last unique element at index k-1.
If they are different, it means we have found a new unique element. We then move the unique element to the position k and increment k.
This way, we effectively overwrite the duplicates and keep only the unique elements at the beginning of the array.
Finally, we return k, which represents the number of unique elements in the array. 
*/
package com.example.Day_4;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums){
        if(nums.length==0)
        return 0;
        int k=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[k-1])
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args)
    {
        RemoveDuplicates obj=new RemoveDuplicates();
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int k=obj.removeDuplicates(nums);
        System.out.println(k);
        for(int i=0;i<k;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}

