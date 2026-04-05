package com.example.Day_1;
import org.junit.jupiter.api.Test;

import com.example.Day_1.TwoSum;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void testBasicCase() {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testNoSolution() {
        TwoSum solution = new TwoSum();
        int[] nums = {1, 2, 3};
        int target = 10;

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void testDuplicateNumbers() {
        TwoSum solution = new TwoSum();
        int[] nums = {3, 3};
        int target = 6;

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }
}