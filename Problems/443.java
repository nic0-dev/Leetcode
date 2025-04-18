// LeetCode 75: Array/String

class Solution {
  public int compress(char[] chars) {
      int len = chars.length;
      int i = 0, write = 0;
      while (i < len) {
          char letter = chars[i];
          int start = i;
          while (i < len && letter == chars[i]) {
              i++;
          }
          int count = i - start;
          chars[write++] = letter;
          if (count > 1) {
              String digit = Integer.toString(count);
              for (char c : digit.toCharArray()) {
                  chars[write++] = c;
              }
          }
      }
      return write;
  }
}