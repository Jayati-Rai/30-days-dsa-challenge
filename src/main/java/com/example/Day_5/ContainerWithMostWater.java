/*
You are given an integer array height of length n. 
There are n vertical lines drawn such that the two endpoints of 
the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, 
such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
*/
package com.example.Day_5;
public class ContainerWithMostWater{
    int containerWithMostWater(int[] height)
    {
        int max=0;
        int area=0;
        int front=0,back=height.length-1;
        int h,w;
        while(front<back)
        {
            if(height[front]<height[back])
            {
                h=height[front];
            }

            else
               { 
                h=height[back];
               }
            w=back-front;
            area=h*w;
            if(h==height[front])
            front++;
            else
            back--;
            if(max<area)
            max=area;
        }
        return max;
    }
    public static void main(String[] args)
    {
        ContainerWithMostWater obj=new ContainerWithMostWater();
        int[] height={1,8,6,2,5,4,8,3,7};
        int max=obj.containerWithMostWater(height);
        System.out.println("Max area: "+max); 
    }
}