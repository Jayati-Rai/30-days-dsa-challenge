package com.example.Day_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

    @Test
    void testNoDuplicates() {
        ContainsDuplicate solution = new ContainsDuplicate();
        int[] nums = {2, 7, 11, 15};

        boolean result = solution.containsDuplicate(nums);

        assertFalse(result);
    }

    @Test
    void testAnotherNoDuplicateCase() {
        ContainsDuplicate solution = new ContainsDuplicate();
        int[] nums = {1, 2, 3};

        boolean result = solution.containsDuplicate(nums);

        assertFalse(result);
    }

    @Test
    void testWithDuplicates() {
        ContainsDuplicate solution = new ContainsDuplicate();
        int[] nums = {3, 3};

        boolean result = solution.containsDuplicate(nums);

        assertTrue(result);
    }
}