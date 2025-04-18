// LeetCode 75: Array/String

class Solution {
  public String reverseVowels(String s) {
      boolean[] vowel = new boolean[128];
      for (char letter : "aeiouAEIOU".toCharArray())
          vowel[letter] = true;
      char[] c = s.toCharArray();
      int left = 0, right = s.length() - 1;
      while (left < right) {
          while(left < right && !vowel[c[left]]) left++;
          while(left < right && !vowel[c[right]]) right--;
          char temp = c[left];
          c[left] = c[right];
          c[right] = temp;
          left++; right--;
      }
      return new String(c);
  }
}