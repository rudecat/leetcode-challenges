package com.rudecate.leetcode.longestSubstringWithoutRepeatingCharacters;

class LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {
      String test = "";
      if (s.equals("")){
          return 0;
      }
      int maxLength = 1;
      for (char ch: s.toCharArray()) {
          String current = String.valueOf(ch);

          // If string already contains the character
          // Then substring after repeating character
          if (test.contains(current)) {
              test = test.substring(test.indexOf(current)
                                    + 1);
          }
          test = test + String.valueOf(ch);
          maxLength = Math.max(test.length(), maxLength);
      }
      return maxLength;
  }
}