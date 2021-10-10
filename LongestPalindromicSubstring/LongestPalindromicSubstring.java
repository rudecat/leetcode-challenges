
public class LongestPalindromicSubstring {
  static public void main(String[] args) {
    LongestPalindromicSubstringSolution solution = new LongestPalindromicSubstringSolution();
    check(solution.longestPalindrome("babad"),"bab");
    check(solution.longestPalindrome("cbbd"),"bb");
    check(solution.longestPalindrome("a"),"a");
    check(solution.longestPalindrome("ac"),"a");
  }

  static private void check(String output, String expect){
    if (output.equals(expect)){
      System.out.println("Correct");
    }else{
      System.out.println("Wrong");
      System.out.println("Output is " + output);
      System.out.println("Expect is " + expect);
    }
  }
}

class LongestPalindromicSubstringSolution {
  public String longestPalindrome(String s) {
      // consider each char as middle, be mindful on odd or even
      String max = "";
      char[] x = s.toCharArray();
      for (int i = 0; i<x.length; i++){
          // for odd case
          String tmp = "" + x[i];
          int l = i-1;
          int r = i+1;
          while(l >= 0 && r< x.length){
              if (x[l] == x[r]){
                  tmp = "" + x[l] + tmp + x[r];
                  l -= 1;
                  r += 1;
                  // System.out.println(tmp);
              }else{
                  break;
              }
          }
          if (tmp.length() > max.length()){
              max = tmp;
          }
          // for even case
          tmp = "";
          l = i;
          r = i+1;
          while(l >= 0 && r< x.length){
              if (x[l] == x[r]){
                  tmp = "" + x[l] + tmp + x[r];
                  l -= 1;
                  r += 1;
                  // System.out.println(tmp);
              }else{
                  break;
              }
          }
          if (tmp.length() > max.length()){
              max = tmp;
          }
      }
      return max;
  }
}