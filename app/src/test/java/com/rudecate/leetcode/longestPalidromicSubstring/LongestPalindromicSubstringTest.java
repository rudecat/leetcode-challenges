/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.rudecate.leetcode.longestPalidromicSubstring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {
    @Test void longestPalindrome() {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        assertEquals(solution.longestPalindrome("babad"),"bab");
        assertEquals(solution.longestPalindrome("cbbd"),"bb");
        assertEquals(solution.longestPalindrome("a"),"a");
        assertEquals(solution.longestPalindrome("ac"),"a");
    }
}
