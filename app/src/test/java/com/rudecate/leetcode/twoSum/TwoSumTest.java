/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.rudecate.leetcode.twoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    @Test void appHasAGreeting() {
        TwoSum solution = new TwoSum();
        assertArrayEquals(solution.twoSum(new int[]{2,7,11,15},9),new int[]{1,0});
        assertArrayEquals(solution.twoSum(new int[]{3,2,4},6),new int[]{2,1});
        assertArrayEquals(solution.twoSum(new int[]{3,3},6),new int[]{1,0});
        assertArrayEquals(solution.twoSum(new int[]{},0),new int[]{0,0});
    }
}
