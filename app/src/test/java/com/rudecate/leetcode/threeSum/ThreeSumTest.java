/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.rudecate.leetcode.threeSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumTest {
    @Test void appHasAGreeting() {
        ThreeSum solution = new ThreeSum();
        assertEquals(solution.threeSum(new int[]{}),"[]");
        assertEquals(solution.threeSum(new int[]{0}),"[]");
        assertEquals(solution.threeSum(new int[]{0,0,0,0}),"[[0, 0, 0]]");
        assertEquals(solution.threeSum(new int[]{-1,0,1,2,-1,-4}),"[[-1, -1, 2], [-1, 0, 1]]");
    }
}
