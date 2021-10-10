
public class LongestSubstringWithoutRepeatingCharacters {
  static public void main(String[] args) {
    LongestSubstringWithoutRepeatingCharactersSolution solution = new LongestSubstringWithoutRepeatingCharactersSolution();
    check(solution.lengthOfLongestSubstring("abcabcbb"),3);
    check(solution.lengthOfLongestSubstring("bbbbb"),1);
    check(solution.lengthOfLongestSubstring("pwwkew"),3);
    check(solution.lengthOfLongestSubstring(""),0);
  }

  static private void check(Integer output, Integer expect){
    if (output == expect){
      System.out.println("Correct");
    }else{
      System.out.println("Wrong");
      System.out.println("Output is " + output.toString());
      System.out.println("Expect is " + expect.toString());
    }
  }
}

class LongestSubstringWithoutRepeatingCharactersSolution {
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