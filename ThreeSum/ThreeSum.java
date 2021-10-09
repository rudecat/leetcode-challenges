import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


public class ThreeSum {
  static public void main(String[] args) {
    ThreeSumSolution solution = new ThreeSumSolution();
    check(solution.threeSum(new int[]{}),"[]");
    check(solution.threeSum(new int[]{0}),"[]");
    check(solution.threeSum(new int[]{0,0,0,0}),"[[0, 0, 0]]");
    check(solution.threeSum(new int[]{-1,0,1,2,-1,-4}),"[[-1, -1, 2], [-1, 0, 1]]");
  }

  static private void check(List<List<Integer>> output, String expect){
    if (output.toString().equals(expect)){
      System.out.println("Correct");
    }else{
      System.out.println("Wrong");
      System.out.println("Output is " + output.toString());
      System.out.println("Expect is " + expect);
    }
  }
}

class ThreeSumSolution {
  public List<List<Integer>> threeSum(int[] nums) {
      //sort the integer array
      Arrays.sort(nums);
      //prepare the result structure
      List<List<Integer>>  res = new ArrayList<>();
      //first result and ensure no duplicate if previous value has been found
      for(int i=0;i<nums.length-2;i++){
          if(i==0 || (i>0 && nums[i]!=nums[i-1])) twoSum(nums,i,res);
      }
      return res;
  }
  public void twoSum(int[] nums, int i, List<List<Integer>> res){
      //2nd
      int low = i+1;
      //3rd
      int high = nums.length-1;
      //ensure the 2nd position is not the same as 3rd position
      while(low<high){
          int sum = nums[low] + nums[high] + nums[i];
          if(sum == 0){
              List<Integer> a = new ArrayList<>();
              a.add(nums[i]);
              a.add(nums[low]);
              a.add(nums[high]);
              low++;
              high--;
              while(low<high && nums[low-1] == nums[low]) low++;
              res.add(a);
          }
          // this part is like finding the weight point when the array is sorted
          // if the sum is larger than sum, that means the right needs to come in because the array is sorted
          else if(sum>0) high--;
          // if the sum is less than sum, that means the left needs to come in
          else low++;
        }
    }
}