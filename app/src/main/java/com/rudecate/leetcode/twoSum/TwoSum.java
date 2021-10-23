package com.rudecate.leetcode.twoSum;
import java.util.HashMap;
import java.util.Arrays;

class TwoSum {
  public int[] twoSum(int[] nums, int target) {
      // Use HashMap to quickly find out if the counterpart exists or not.
      HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
      // Reverse checking will make it even faster.
      for (int i = 0; i < nums.length; i ++){
          if (m.get(target-nums[i]) != null){
              return new int[]{i,m.get(target-nums[i])};
          }
          m.put(nums[i], i);
      }
      return new int[]{0,0};
  }
}