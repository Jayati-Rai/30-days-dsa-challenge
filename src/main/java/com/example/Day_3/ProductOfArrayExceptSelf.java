package com.example.Day_3;

public class ProductOfArrayExceptSelf {
    int[] productOfArrayExceptSelf(int[] nums)
    {
        int product=1;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=product;
            product*=nums[i];
        }//creating a prefix product
        product=1;
        for(int i=nums.length-1;i>0;i--)
        {
            product*=nums[i];
            ans[i-1]=product*ans[i-1];
        }
        return ans;        
    }
    public static void main(String[] args)
    {
        ProductOfArrayExceptSelf obj=new ProductOfArrayExceptSelf();
        int[] nums={1,2,3,4};
        int [] ans=obj.productOfArrayExceptSelf(nums);
        for(int a:ans)
        {
            System.out.print(a+" ");
        }
    }
}
