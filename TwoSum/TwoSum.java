import java.util.HashMap;
import java.util.Arrays;


public class TwoSum {
  static public void main(String[] args) {
    TwoSumSolution solution = new TwoSumSolution();
    check(solution.twoSum(new int[]{2,7,11,15},9),"[1, 0]");
    check(solution.twoSum(new int[]{3,2,4},6),"[2, 1]");
    check(solution.twoSum(new int[]{3,3},6),"[1, 0]");
    check(solution.twoSum(new int[]{},0),"[0, 0]");
  }

  static private void check(int[] output, String expect){
    if (Arrays.toString(output).equals(expect)){
      System.out.println("Correct");
    }else{
      System.out.println("Wrong");
      System.out.println("Output is " + Arrays.toString(output));
      System.out.println("Expect is " + expect);
    }
  }
}

class TwoSumSolution {
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